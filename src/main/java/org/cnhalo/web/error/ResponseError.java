package org.cnhalo.web.error;

/**
 *
 *
 * @author	HuangYijie
 * @date	2015年12月21日 下午11:34:06
 * 
 */
public class ResponseError {
	
	private String message;
	
	public ResponseError(String message, Object...args) {
		this.message = String.format(message, args);
	}
	
	public ResponseError(Exception e) {
		this.message = e.getMessage();
	}
	
	public String getMessage() {
		return message;
	}
	
}
