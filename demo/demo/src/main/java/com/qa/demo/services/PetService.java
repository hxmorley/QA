package com.qa.demo.services;

import com.qa.demo.entities.Person;
import com.qa.demo.entities.Pet;
import com.qa.demo.repos.PersonRepo;
import com.qa.demo.repos.PetRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;



@Service
public class PetService {

    private PetRepo repo;


    public PetService(PetRepo repo) {
        this.repo = repo;
    }

    public List<Pet> getAll(){
        return this.repo.findAll();
    }


    public ResponseEntity<?> getPet( Integer id) {
        return ResponseEntity.ok(this.repo.findById(id).get());
    }

    public ResponseEntity<Pet> createPet( Pet newPet){
        Pet added = this.repo.save(newPet);
        return new ResponseEntity<>(added, HttpStatus.CREATED);
    }

    public Pet updatePet(int id, String name, Integer age, String breed){
        Pet toUpdate = this.repo.findById(id).get();

        if (name != null) toUpdate.setName(name);
        if (age != null) toUpdate.setAge(age);
        if (breed != null) toUpdate.setBreed(breed);

        return this.repo.save(toUpdate);
    }

    public ResponseEntity<?> removePet(@PathVariable Integer id) {
        Pet removePet = this.repo.findById(id).get();
        this.repo.deleteById(id);
        return ResponseEntity.ok(removePet);
    }
}
