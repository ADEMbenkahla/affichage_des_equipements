package com.sfm.stage.repository;

import com.sfm.stage.entity.Logistique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogistiqueRepository extends JpaRepository<Logistique, Long> {
	Logistique findByNom(String nom);
}
