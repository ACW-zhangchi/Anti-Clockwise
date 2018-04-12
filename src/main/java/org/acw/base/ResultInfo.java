package org.acw.base;

/**
 * @author yinliangyun
 *
 * 2018年3月30日-下午10:34:35
 */
public class ResultInfo {
	
	private Integer resultCode;
	private String resultMessage;
	private Object result;
	
	public Integer getResultCode() {
		return resultCode;
	}
	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMessage() {
		return resultMessage;
	}
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	
	
}
