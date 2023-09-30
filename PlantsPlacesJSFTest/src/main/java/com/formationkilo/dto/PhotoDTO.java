package com.formationkilo.dto;

public class PhotoDTO {
	private int id;
	private int foreignKeyLieuId;
	private String uri;
	private String dateTaken;
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
	public String getDateTaken() {
		return dateTaken;
	}
	public void setDateTaken(String dateTaken) {
		this.dateTaken = dateTaken;
	}
	public String getContributor() {
		return contributor;
	}
	public void setContributor(String contributor) {
		this.contributor = contributor;
	}
	
	

}
