package org.acw.util;

import java.security.MessageDigest;

/**
 * @author yinliangyun
 *
 * 2018年3月26日-下午8:55:17
 */
public class MD5Util {

    /**
     * md5加密
     * @param str 需要加密的信息
     * @return
     */
	public static String md5Method(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.reset();
			md.update(str.getBytes("UTF-8"));
			byte[] byteArray = md.digest();

			StringBuffer md5StrBuff = new StringBuffer();

			for (int i = 0; i < byteArray.length; i++)
			{
				if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)
					md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));
				else
					md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));
			}
			return md5StrBuff.toString();
		}
		catch (Exception e) {
			return "";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(md5Method("123"));
	}
	
}
