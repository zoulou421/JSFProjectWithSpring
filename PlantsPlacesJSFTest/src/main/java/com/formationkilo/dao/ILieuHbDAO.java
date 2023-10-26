package com.formationkilo.dao;

import java.util.List;

import org.hibernate.Session;

import com.formationkilo.dto.LieuDTO;

public interface ILieuHbDAO {

	void insert(Session session,LieuDTO lieuDTO) throws Exception;

	List<LieuDTO> fetchByModuleFormationId(int idModuleFormation);

}