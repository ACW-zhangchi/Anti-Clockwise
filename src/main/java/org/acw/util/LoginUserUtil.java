package org.acw.util;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.StringUtils;

/**
 * @author yinliangyun
 *
 * 2018年3月30日-下午10:25:55
 */
public class LoginUserUtil {

	 /**
	  * 借助CookieUtil方法获取cookie中的userid
     * 从cookie中获取userId
     * @param request
     * @return
     */
	public static Integer releaseUserIdFromCookie(HttpServletRequest request) {
		String userIdString = CookieUtil.getCookieValue(request, "userIdString");
		if(StringUtils.isEmpty(userIdString)){
			return null;
		}
		Integer userId = UserIDBase64.decoderUserID(userIdString);
		return userId;
	}
	
	
}
