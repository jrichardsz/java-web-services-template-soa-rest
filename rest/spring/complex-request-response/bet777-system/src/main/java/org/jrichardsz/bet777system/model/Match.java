package org.jrichardsz.bet777system.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

public class Match implements Serializable{

	private static final long serialVersionUID = -7788619177798333712L;
	
	private int idMatch;
	private int idTeam01;
	private String labelTeam01;
	private int idTeam02;
	private String labelTeam02;
	private Date dateMatch;
	
	public int getIdMatch(){
		return idMatch;
	}
	public void setIdMatch(int idMatch){
		this.idMatch=idMatch;
	}
	public int getIdTeam01(){
		return idTeam01;
	}
	public void setIdTeam01(int idTeam01){
		this.idTeam01=idTeam01;
	}
	public String getLabelTeam01(){
		return labelTeam01;
	}
	public void setLabelTeam01(String labelTeam01){
		this.labelTeam01=labelTeam01;
	}
	public int getIdTeam02(){
		return idTeam02;
	}
	public void setIdTeam02(int idTeam02){
		this.idTeam02=idTeam02;
	}
	public String getLabelTeam02(){
		return labelTeam02;
	}
	public void setLabelTeam02(String labelTeam02){
		this.labelTeam02=labelTeam02;
	}
	
	@JsonSerialize(using=DateSerializer.class)
	public Date getDateMatch(){
		return dateMatch;
	}
	public void setDateMatch(Date dateMatch){
		this.dateMatch=dateMatch;
	}

	
	
}
