package com.sfm.stage.service;


import java.util.List;

import com.sfm.stage.entity.Logistique;

public interface LogistiqueService {
	
    void saveLogistique(Logistique logistique);

    Logistique findById(long id);

    List<Logistique> findAllLogistiques();
    
    void deleteById(long id);
}