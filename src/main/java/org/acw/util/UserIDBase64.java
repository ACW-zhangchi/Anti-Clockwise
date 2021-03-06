package org.acw.util;

import org.springframework.util.StringUtils;

import com.sun.org.apache.xml.internal.security.utils.Base64;

/**
 * @author yinliangyun
 *
 * 2018年3月26日-下午8:54:40
 */
@SuppressWarnings("restriction")
public class UserIDBase64 {

    /**
     * userID解密
     * @param encodedUserID 加密后的用户ID
     * @return
     */
	public static Integer decoderUserID(String encodedUserID)  {
		if (StringUtils.isEmpty(encodedUserID)) {
			return null;
		}
		try {
			String reversedString = new StringBuffer(encodedUserID).reverse().toString();
			String base64String = reversedString.replaceAll("#", "=");
			int userIDPos = base64String.indexOf("==") + 6;
			String realBase64UserID = base64String.substring(userIDPos);
			String base64Encoded = new String(Base64.decode(realBase64UserID.getBytes()));
			return Integer.parseInt(base64Encoded);
		} catch (Exception e) {
			return null;
		}
	}

    /**
     * 用户ID加密
     * @param userID 用户ID
     * @return
     */
	public static String encoderUserID(Integer userID){
		String base64UserIDEncoded = Base64.encode((userID + "").getBytes());
		String currentStringBase64Encoded = Base64.encode((System.currentTimeMillis() + "").getBytes());
		String keyString = currentStringBase64Encoded  
				+ currentStringBase64Encoded.substring(4, 8) + base64UserIDEncoded;
		byte[] codeBytes = keyString.getBytes();
		byte[] ordedBytes = new byte[codeBytes.length];
		for(int i=0; i<codeBytes.length; i++){
			ordedBytes[i] = codeBytes[codeBytes.length-i-1];
		}
		return new String(ordedBytes).replaceAll("=", "#");
	}
	
}