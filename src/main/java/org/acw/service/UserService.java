package org.acw.service;

import org.acw.dao.UserDao;
import org.acw.exception.ParamException;
import org.acw.model.User;
import org.acw.util.MD5Util;
import org.acw.util.UserIDBase64;
import org.acw.vo.UserLoginIdentity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author yinliangyun
 *
 * 2018年3月26日-下午8:56:23
 */
@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	/**
	 * 用户登录
	 * @param userName 用户名
	 * @param password 密码
	 */
	public UserLoginIdentity login(String userName, String password) {
		
		// 非空验证
		if (StringUtils.isEmpty(userName)) {
			throw new ParamException(100, "请输入用户名");
		}
		if (StringUtils.isEmpty(password)) {
			throw new ParamException(101, "请输入密码");
		}
		// 根据用户名查询用户在验证
		User user = userDao.findByUserName(userName.trim());
		if (user == null) {
			throw new ParamException(102, "用户名密码错误，请重新输入");
		}
		// 密码验证：需要MD5加密
		if (!MD5Util.md5Method(password).equals(user.getPassword())) {
			throw new ParamException(103, "用户名密码错误，请重新输入");
		}
		// 构建登录实体
		UserLoginIdentity userLoginIdentity = new UserLoginIdentity();
		userLoginIdentity.setUserIdString(UserIDBase64.encoderUserID(user.getId()));
		userLoginIdentity.setRealName(user.getTrueName());
		userLoginIdentity.setUserName(userName);
		return userLoginIdentity;
	}
	
}
