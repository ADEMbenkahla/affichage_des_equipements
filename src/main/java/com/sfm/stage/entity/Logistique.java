package com.sfm.stage.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="logistiques")
public class Logistique {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(nullable=false, unique=true)
    private String nom;
	
	@Column(nullable=false)
    private Integer quantite;
	
	@Column(nullable=false)
	private String description;
	
	public Logistique() {
		super();
	}

	public Logistique(String nom, String description, Integer quantite) {
		super();
		this.nom = nom;
		this.description = description;
		this.quantite = quantite;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Logistique [nom=" + nom + ", description=" + description + ", quantite=" + quantite + "]";
	}

}