package com.formationkilo.ui;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@ManagedBean
@Scope("session")
public class SearchFormation {

	public String execute() {
		return "noresults";
	}
}
