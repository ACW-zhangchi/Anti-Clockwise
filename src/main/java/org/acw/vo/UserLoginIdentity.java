package org.acw.vo;

import java.io.Serializable;

/**
 * @author yinliangyun
 *
 * 2018年3月26日-下午8:50:52
 */
public class UserLoginIdentity implements Serializable {
    
	private static final long serialVersionUID = -2853266229407989869L;
	
	// 将userId加密
	private String userIdString;
    private String userName;
    private String realName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserIdString() {
        return userIdString;
    }

    public void setUserIdString(String userIdString) {
        this.userIdString = userIdString;
    }

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder().append("userIdString=")
				.append(userIdString).append("userName=").append(userName).append("realName=").append(realName);
		return stringBuilder.toString();
	}

}
