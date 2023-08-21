package com.formationkilo.service;
import java.util.List;

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
}
