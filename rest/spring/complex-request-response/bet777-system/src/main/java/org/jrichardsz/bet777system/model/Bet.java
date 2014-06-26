package org.jrichardsz.bet777system.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

public class Bet implements Serializable{

	private static final long serialVersionUID=1L;
	
	private int idMatch;
	private int scoreTeam01;
	private int scoreTeam02;
	private Date createdDate;
	
	
	@JsonSerialize(using=DateSerializer.class)
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getIdMatch(){
		return idMatch;
	}
	public void setIdMatch(int idMatch){
		this.idMatch=idMatch;
	}
	public int getScoreTeam01(){
		return scoreTeam01;
	}
	public void setScoreTeam01(int scoreTeam01){
		this.scoreTeam01=scoreTeam01;
	}
	public int getScoreTeam02(){
		return scoreTeam02;
	}
	public void setScoreTeam02(int scoreTeam02){
		this.scoreTeam02=scoreTeam02;
	}
	
	
	
}
