package com.formationkilo.dto;

import java.util.Date;

import javax.inject.Named;

@Named
public class PhotoDTO {
	private int id;
	private int foreignKeyLieuId;
	private String uri;
	private Date dateTaken;
	private String contributor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getForeignKeyLieuId() {
		return foreignKeyLieuId;
	}
	public void setForeignKeyLieuId(int foreignKeyLieuId) {
		this.foreignKeyLieuId = foreignKeyLieuId;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public Date getDateTaken() {
		return dateTaken;
	}
	public void setDateTaken(Date dateTaken) {
		this.dateTaken = dateTaken;
	}
	public String getContributor() {
		return contributor;
	}
	public void setContributor(String contributor) {
		this.contributor = contributor;
	}
	
	

}
