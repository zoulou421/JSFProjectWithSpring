package com.formationkilo.ui;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.formationkilo.dto.LieuDTO;
import com.formationkilo.dto.ModuleFormation;
import com.formationkilo.service.IModuleFormationService;

@Named
@ManagedBean
@Scope("session")
public class LieuUI {

	private ModuleFormation moduleFormation;
	
	@Inject
    private IModuleFormationService moduleFormationService;

	@Inject
	private LieuDTO lieuDTO;
	
	public LieuDTO getLieuDTO() {
		return lieuDTO;
	}

	public void setLieuDTO(LieuDTO lieuDTO) {
		this.lieuDTO = lieuDTO;
	}

	public ModuleFormation getModuleFormation() {
		return moduleFormation;
	}

	public void setModuleFormation(ModuleFormation moduleFormation) {
		this.moduleFormation = moduleFormation;
		//add picture
		loadLieux();
		//fin add pic
	}
	//add pic
	private void loadLieux() {
		// TODO Auto-generated method stub
		moduleFormationService.loadLieux(moduleFormation);
	}
	//fin add pic

	public String saveLieu() {
		//set the foreign key to the ModuleFormation id  before saving
		lieuDTO.setForeignKeyModForId(moduleFormation.getGuid());
		try {
			moduleFormationService.saveLieu(lieuDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Lieu saved successfully!!!";
	}
	
}
