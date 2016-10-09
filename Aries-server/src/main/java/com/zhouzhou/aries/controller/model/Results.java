package com.zhouzhou.aries.controller.model;

/**
 * 
 * @author zhouzhou
 *
 * @param <T>
 */
public class Results<T> {
	
	private Integer code;
	private String message;
	private T data;
	private T defaultData;
	
	public Integer getCode() {
		return code;
	}
	
	public void setCode(Integer code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}
	public void setData(T data) {
		if(data==null)
			this.code=404;
		this.data = data;
	
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	public T getDefaultData() {
		return defaultData;
	}

	public void setDefaultData(T defaultData) {
		this.defaultData = defaultData;
	}

	public Results(){
		
	}
	
	/**
	 * 
	 * @param code
	 * @param data
	 */
	public Results(Integer code, T data) {
		super();
		this.code = code;
		this.data = data;
	}

	/**
	 * 
	 * @param code
	 * @param message
	 * @param data
	 * @param defaultData
	 */
	public Results(Integer code, String message, T data,T defaultData) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
		this.defaultData = defaultData;
	}
	

	/**
	 * 
	 * @param code
	 * @param message
	 * @param data
	 */
	public Results(Integer code, String message, T data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}
}	