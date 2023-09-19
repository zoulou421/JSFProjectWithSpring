package com.formationkilo.service;
import java.util.List;

import com.formationkilo.dto.Lieu;
import com.formationkilo.dto.ModuleFormation;
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
   public List<ModuleFormation> filterModuleFormation(String filter);
   
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

void save(Lieu lieu) throws Exception;
}
