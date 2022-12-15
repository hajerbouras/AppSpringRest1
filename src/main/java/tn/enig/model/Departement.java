package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id ;
	private String description ;


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Departement() {
		super();
	}
	public Departement(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Departement [id=" + id + ", description=" + description + "]";
	}
	

}

