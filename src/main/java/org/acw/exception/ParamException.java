package org.acw.exception;

/**
 * @author yinliangyun
 *
 * 2018年3月26日-下午9:18:44
 */
@SuppressWarnings("serial")
public class ParamException extends RuntimeException {
	
	private int errorCode;
	
	public ParamException() {
	}

	public ParamException(String message) {
		super(message);
	}
	
	public ParamException(int errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	
	
	

}
