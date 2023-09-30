package com.formationkilo.dto;

import java.util.Date;

public class Photo {

	private int id;
	private int lieuDTOId;
	private String uri;
	private Date dateTaken;
	private String contributor;
	
	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getLieuDTOId() {
		return lieuDTOId;
	}




	public void setLieuDTOId(int lieuDTOId) {
		this.lieuDTOId = lieuDTOId;
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




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return uri;
	}
}
