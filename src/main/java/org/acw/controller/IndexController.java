package org.acw.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yinliangyun
 *
 * 2018年3月26日-下午9:19:18
 */
@Controller
public class IndexController {
	
	
	@RequestMapping("index")
	public String index(Model model, HttpServletRequest request) {
		String contextPath = request.getContextPath();
		model.addAttribute("ctx", contextPath);
		return "index";
	}
	
	
	@RequestMapping("main")
	public String main(Model model, HttpServletRequest request) {
		String contextPath = request.getContextPath();
		model.addAttribute("ctx", contextPath);
		return "main";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public Map<String, Object> hello() {
		Map<String, Object> map = new HashMap<>();
		map.put("resultCode", 200);
		map.put("message", "Success OK");
		return map;
	}
}
