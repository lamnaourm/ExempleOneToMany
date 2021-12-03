package com.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Filiere {

	@Id
	@GeneratedValue
	@Column(name="ID_FIL")
	private int id;
	
	@Column(name="nom_fil")
	private String nom;
	
	@OneToMany(mappedBy="filiere", fetch=FetchType.EAGER)
	private List<Etudiant> etudiants;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	@Override
	public String toString() {
		return "Filiere [id=" + id + ", nom=" + nom + "]";
	} 
	
	
}