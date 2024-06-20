package com.sfm.stage.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sfm.stage.entity.Logistique;
import com.sfm.stage.repository.LogistiqueRepository;
import com.sfm.stage.service.LogistiqueService;

@Service
public class LogistiqueServiceImpl implements LogistiqueService {

    private LogistiqueRepository logistiqueRepository;

    public LogistiqueServiceImpl(LogistiqueRepository logistiqueRepository) {
        this.logistiqueRepository = logistiqueRepository;
    }
    
    @Override
    public void saveLogistique(Logistique logistique) {
    	logistiqueRepository.save(logistique);
    }
    
    @Override
    public List<Logistique> findAllLogistiques() {
    	return logistiqueRepository.findAll();
    }

   @Override
	public Logistique findById(long id) {
		return logistiqueRepository.findById(id).get();
	}
   
   @Override
	public void deleteById(long id) {
		logistiqueRepository.deleteById(id);
	}
   
}