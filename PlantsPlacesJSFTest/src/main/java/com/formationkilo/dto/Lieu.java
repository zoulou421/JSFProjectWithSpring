package com.formationkilo.dto;

import java.io.Serializable;

import javax.inject.Named;


@Named
public class Lieu implements Serializable{

	private int id;
	private int moduleFormationId;
	private String latitude;
	private String longitude;
	private String moduleFormationedBy;
	private String moduleFormationedDate;
	private String description;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getModuleFormationId() {
		return moduleFormationId;
	}
	public void setModuleFormationId(int moduleFormationId) {
		this.moduleFormationId = moduleFormationId;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getModuleFormationedBy() {
		return moduleFormationedBy;
	}
	public void setModuleFormationedBy(String moduleFormationedBy) {
		this.moduleFormationedBy = moduleFormationedBy;
	}
	public String getModuleFormationedDate() {
		return moduleFormationedDate;
	}
	public void setModuleFormationedDate(String moduleFormationedDate) {
		this.moduleFormationedDate = moduleFormationedDate;
	}
	
	
}
