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

import com.pfe.faculty.entities.Enseignant;
import com.pfe.faculty.exception.ResourceNotFoundException;
import com.pfe.faculty.repository.EnseignantRepository;

public class EnseignantController {
	@RestController 
	@RequestMapping("/api/v1/teachers")
	public class EtudiantController {
		
		 
		private EnseignantRepository enseignantRepository;
		
		
		
		public EtudiantController(EnseignantRepository enseignantRepository) {
			super();
			this.enseignantRepository = enseignantRepository;
		}
		// create get all etudiant api
		@GetMapping("/getAll")
		public List<Enseignant> getAllEnseignants(){
			return enseignantRepository.findAll();
		}
	   // create enseignant
		@PostMapping("/createTeacher")
		public Enseignant createEnseignant(@Validated @RequestBody Enseignant enseignant) {
			return enseignantRepository.save(enseignant);
		}
		// get enseignant by id 
		@GetMapping ("/getTeacher/{id}")
		public ResponseEntity<Enseignant> getTeacherById(@PathVariable(value = "id") long enseignantId) 
				throws ResourceNotFoundException{
			Enseignant enseignant = enseignantRepository.findById(enseignantId)
					.orElseThrow(() -> new ResourceNotFoundException("Enseignant not found for this id :: " + enseignantId));
			return ResponseEntity.ok().body(enseignant);
		}
		// update enseignant
		
		@PutMapping("/updateTeacher/{id}")
		public ResponseEntity<Enseignant> updateEnseignant(@PathVariable(value = "id") long enseignantId 
			, @RequestBody Enseignant enseignantDetails ) throws ResourceNotFoundException{
			Enseignant enseignant = enseignantRepository.findById(enseignantId)
					.orElseThrow(() -> new ResourceNotFoundException("Etudiant not found for this id :: " + enseignantId));
			enseignant.setCinP(enseignantDetails.getCinP());
			enseignant.setEmailP(enseignantDetails.getEmailP());
			enseignant.setNomP(enseignantDetails.getNomP());
			enseignant.setPrenomP(enseignantDetails.getPrenomP());
			enseignantRepository.save(enseignant);
			return ResponseEntity.ok().body(enseignant);
		}
		
		//delete enseignant by id
		@DeleteMapping("/deleteTeacher/{id}")
		public ResponseEntity<Object> deleteEnseignant(@PathVariable(value = "id") long enseignantId) throws ResourceNotFoundException{
			enseignantRepository.findById(enseignantId)
					.orElseThrow(() -> new ResourceNotFoundException("Enseignant not found for this id :: " + enseignantId));
			enseignantRepository.deleteById(enseignantId);
			return ResponseEntity.ok().build();
			}
		
		
		
	}


}
