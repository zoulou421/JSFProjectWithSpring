package com.formationkilo.dto;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@ManagedBean
@Scope("session")
public class ModuleFormation {

  private String name;
  private String type;
  private String langage;
  private String description;
  private String lieu;

  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  
  
  
  public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getLangage() {
	return langage;
}
public void setLangage(String langage) {
	this.langage = langage;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getLieu() {
	return lieu;
}
public void setLieu(String lieu) {
	this.lieu = lieu;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+type+" "+langage+" "+description+" "+lieu;
	}
  
}
