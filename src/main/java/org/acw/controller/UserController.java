package org.acw.controller;

import java.util.HashMap;
import java.util.Map;

import org.acw.exception.ParamException;
import org.acw.service.UserService;
import org.acw.vo.UserLoginIdentity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yinliangyun
 *
 * 2018年3月26日-下午9:19:09
 */
@RequestMapping("user")
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("login")
	@ResponseBody
	public Map<String, Object> login(String userName, String password) {
		Map<String, Object> map = new HashMap<>();
		try {
			UserLoginIdentity userLoginIdentity = userService.login(userName, password);
			map.put("resultCode", 1);
			map.put("message", "Success");
			map.put("result", userLoginIdentity);
		} catch (ParamException e) {
			map.put("resultCode", e.getErrorCode());
			map.put("message", e.getMessage());
			map.put("result", e.getMessage());
		}
		
		return map;
	}

}
