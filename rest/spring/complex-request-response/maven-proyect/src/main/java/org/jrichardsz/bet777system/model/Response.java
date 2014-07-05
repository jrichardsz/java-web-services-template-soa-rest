package org.jrichardsz.bet777system.model;

import java.io.*;

public class Response implements Serializable{

	private static final long serialVersionUID = -7788619177798333712L;
	
	private String code;
	private String message;
	private Object content;
	
	public String getCode(){
		return code;
	}
	public void setCode(String code){
		this.code=code;
	}
	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message=message;
	}
	public Object getContent(){
		return content;
	}
	public void setContent(Object content){
		this.content=content;
	}

}
