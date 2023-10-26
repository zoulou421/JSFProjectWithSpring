package com.formationkilo.service;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.hibernate.Session;

import com.formationkilo.dto.LieuDTO;
import com.formationkilo.dto.ModuleFormation;
import com.formationkilo.dto.PhotoDTO;




/**
 * IModuleFormationService includes all business
 *  related functions for  ModuleFormation and related entities 
 * @author Bonevy BEBY
 *
 */

public interface IModuleFormationService {
   /**
    * return a collection of ModuleFormation objects that contain the given filter text.
    * @param filter a substring that should be contained in returned  ModuleFormations
    * @return a collection of matching  ModuleFormation
    */

   /**
    * save a moduleFormation and perform a validation check
    * @param moduleFormation we are persisting
    * @throws Exception if unable to save
    */
   public void save(ModuleFormation moduleFormation) throws Exception;

/**
 * Return a list of ModuleFormation that match the given criteria search
 * @param moduleFormation a parameter that contains the search criteria
 * @return
 */
List<ModuleFormation> fetchModuleFormation(ModuleFormation moduleFormation);



void saveLieu(Session session, LieuDTO lieuDTO)throws Exception;

List<ModuleFormation> filterModuleFormation(String filter);

//Load a lieu for a speficique ModuleFormation
//add picture step
public void loadLieux(ModuleFormation moduleFormation);

public void savePhoto(PhotoDTO photoDTO, InputStream inputStream) throws  Exception;



}