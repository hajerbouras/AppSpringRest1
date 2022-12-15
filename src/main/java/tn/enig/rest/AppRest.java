package tn.enig.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enig.dao.IDepartement;
import tn.enig.dao.IEmploye;
import tn.enig.model.Departement;
import tn.enig.model.Employe;

@RestController
public class AppRest {
	
	@Autowired
	IEmploye daoe;
	
	@Autowired
	IDepartement daop;

	private void setDaoe(IEmploye daoe) {
		this.daoe = daoe;
	}

	private void setDaop(IDepartement daop) {
		this.daop = daop;
	}
	
	@GetMapping("/Employe")
	public List<Employe>g1(){
		return daoe.findAll();
	}
	@GetMapping("/Departement")
	public List<Departement>g2(){
		return daop.findAll();
		
	}

	@PostMapping("/add")
	public void f2(@RequestBody Employe e) {
		    daoe.save(e);
	}


	@DeleteMapping("/deleteEm/{id}")
	public void f3(@PathVariable("id") int id) {
		daoe.deleteById(id);
	}
	
	
	

}
