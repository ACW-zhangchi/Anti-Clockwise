package org.acw.base;

import org.acw.exception.ParamException;
import org.springframework.util.StringUtils;


/**
 * @author yinliangyun
 *
 * 2018年3月30日-下午10:28:09
 */
public class AssertUtil {

	
	/**
	 * 对象不能为空
	 * @param value
	 * @param code
	 * @param message
	 */
	public static void notNull(Object value, String... message){
		if(value == null) {
			throw new ParamException(loadMessage(message));
		}
		
	}
	
	
	/**
	 * 对象不能为空              方法的重写
	 * @param value
	 * @param code
	 * @param message
	 */
	public static void notNull(Object value, Integer code, String... message) {
		if (value == null) {
			throw new ParamException(code, loadMessage(message));
		}
	}
	
	
	/**
	 * 字符串不能为空
	 * @param value
	 * @param code
	 * @param message
	 */
	public static void isNotEmpty(String value, String... message){
		if(StringUtils.isEmpty(value)){
			throw new ParamException(loadMessage(message));
		}
	}
	
	/**
	 * 字符串不能为空
	 * @param value
	 * @param code
	 * @param message
	 */
	public static void isNotEmpty(String value, Integer code, String... message) {
		if (StringUtils.isEmpty(value)) {
			throw new ParamException(code, loadMessage(message));
		}
	}
	
	
	/**
	 * Integer不能为空
	 * @param value
	 * @param message
	 */
	public static void intIsNotEmpty(Integer value, String... message){
		isTrue(value == null || value < 1, loadMessage(message));
	}
	public static void isTrue(boolean isTrue, String... message) {
		if (isTrue) {
			throw new ParamException(loadMessage(message));
		}
	}
	
	
	
	
	
	/**
	 * 获取打印消息
	 * @param message
	 * @return
	 */
	public static String loadMessage(String... message){
		String msg = "";
		if(message == null || message.length == 0 || StringUtils.isEmpty(message[0])){
			msg = Constant.ERROR_MSG;
		} else {
			msg = message[0];
		}
		return msg;
	}
	
	
}
