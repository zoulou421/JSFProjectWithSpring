package com.formationkilo.dao;

import java.util.List;

import com.formationkilo.dto.Lieu;

public interface ILieuDAO {

	void insert(Lieu lieu) throws Exception;

	List<Lieu> fetchByModuleFormationId(int moduleFormationId);

}