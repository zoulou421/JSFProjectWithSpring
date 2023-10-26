package com.formationkilo.dao;

import java.util.List;

import org.hibernate.Session;

import com.formationkilo.dto.Lieu;

public interface ILieuDAO {

	//void insert(Lieu lieu) throws Exception; ref MaClasseCentrale
	 void insert(Session session, Lieu lieu) throws Exception;
	
	List<Lieu> fetchByModuleFormationId(int moduleFormationId);

}