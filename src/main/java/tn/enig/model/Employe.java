package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employe {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id ;
	private String nom;
	private String fonction;
	@ManyToOne
	@JoinColumn(name ="dept_id")
	private Departement dept ;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public Departement getDept() {
		return dept;
	}
	public void setDept(Departement dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", fonction=" + fonction + ", dept=" + dept + "]";
	}
	
	
	

}
