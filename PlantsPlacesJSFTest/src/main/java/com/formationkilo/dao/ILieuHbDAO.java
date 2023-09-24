package com.formationkilo.dao;

import java.util.List;

import com.formationkilo.dto.LieuDTO;

public interface ILieuHbDAO {

	void insert(LieuDTO lieuDTO) throws Exception;

	List<LieuDTO> fetchByModuleFormationId(int idModuleFormation);

}