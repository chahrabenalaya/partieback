package com.pfe.faculty.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.faculty.entities.Etudiant;
import com.pfe.faculty.exception.ResourceNotFoundException;
import com.pfe.faculty.repository.EtudiantRepository;

@RestController 
@RequestMapping("/api/v1/students")
public class EtudiantController {
	
	
	private EtudiantRepository etudiantRepository;
	
	public EtudiantController(EtudiantRepository etudiantRepository) {
		super();
		this.etudiantRepository = etudiantRepository;
	}
	// create get all etudiant api
	@GetMapping("/getAll")
	public List<Etudiant> getAllEtudiant(){
		return etudiantRepository.findAll();
	}
   // create etudiant
	@PostMapping("/createStudent")
	public Etudiant createEtudiant(@Validated @RequestBody Etudiant etudiant) {
		return etudiantRepository.save(etudiant);
	}
	// get etudiant by id 
	@GetMapping ("/getStudent/{id}")
	public ResponseEntity<Etudiant> getetudiantById(@PathVariable(value = "id") long etudiantId) 
			throws ResourceNotFoundException{
		Etudiant etudiant = etudiantRepository.findById(etudiantId)
				.orElseThrow(() -> new ResourceNotFoundException("Etudiant not found for this id :: " + etudiantId));
		return ResponseEntity.ok().body(etudiant);
	}
	// update etudiant
	
	@PutMapping("/updateStudent/{id}")
	public ResponseEntity<Etudiant> updateEtudiant(@PathVariable(value = "id") long etudiantId 
		, @RequestBody Etudiant etudiantDetails ) throws ResourceNotFoundException{
		Etudiant etudiant = etudiantRepository.findById(etudiantId)
				.orElseThrow(() -> new ResourceNotFoundException("Etudiant not found for this id :: " + etudiantId));
		etudiant.setCinEtu(etudiantDetails.getCinEtu());
		etudiant.setEmailEtu(etudiantDetails.getEmailEtu());
		etudiant.setNomEtu(etudiantDetails.getNomEtu());
		etudiant.setPrenomEtu(etudiantDetails.getPrenomEtu());
		etudiantRepository.save(etudiant);
		return ResponseEntity.ok().body(etudiant);
	}
	
	//delete etudiant by id
	@DeleteMapping("/deleteStudent/{id}")
	public ResponseEntity<Object> deleteEtudiant(@PathVariable(value = "id") long etudiantId) throws ResourceNotFoundException{
		 etudiantRepository.findById(etudiantId)
				.orElseThrow(() -> new ResourceNotFoundException("Etudiant not found for this id :: " + etudiantId));
		etudiantRepository.deleteById(etudiantId);
		return ResponseEntity.ok().build();
		}
	
	
	
}
