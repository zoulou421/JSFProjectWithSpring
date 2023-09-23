package com.formationkilo.dto;

import java.io.Serializable;

import javax.inject.Named;

@Named
public class LieuDTO implements Serializable {

	private int id;
	private int ForeignKeyModForId;
	private String latitude;
	private String longitude;
	private String moduleFormationedBy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getForeignKeyModForId() {
		return ForeignKeyModForId;
	}
	public void setForeignKeyModForId(int foreignKeyModForId) {
		ForeignKeyModForId = foreignKeyModForId;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String moduleFormationedDate;
	private String description;
}
