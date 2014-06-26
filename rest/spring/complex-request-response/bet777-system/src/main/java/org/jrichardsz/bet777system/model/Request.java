package org.jrichardsz.bet777system.model;

import java.io.*;

public class Request implements Serializable{

	private static final long serialVersionUID = -7788619177798333712L;
	
	private String mail;

	public String getMail(){
		return mail;
	}

	public void setMail(String mail){
		this.mail=mail;
	}

	
	
}
