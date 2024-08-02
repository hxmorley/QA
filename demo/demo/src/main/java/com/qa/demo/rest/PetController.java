package com.qa.demo.rest;

import java.util.ArrayList;
import java.util.List;

import com.qa.demo.entities.Pet;
import com.qa.demo.services.PetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PetController {

    private PetService service;

    public PetController (PetService service){
        this.service = service;
    }

    @GetMapping("/pet/getAll")
    public List<Pet> getAll(){
        return this.service.getAll();
    }

    @GetMapping("/pet/{id}")
    public ResponseEntity<?> getPet(@PathVariable Integer id) {
        return this.service.getPet(id);
    }


    @PostMapping ("/addPet")
    public ResponseEntity<Pet> createPet(@RequestBody Pet newPet){
        return this.service.createPet(newPet);
    }


    @DeleteMapping("/pet/{id}")
    public ResponseEntity<?> removePet(@PathVariable Integer id) {
        return this.service.removePet(id);
    }

    @PatchMapping("/pet/update/{id}")
    public Pet updatePet(@PathVariable int id,
                               @RequestParam(required = false) String name,
                               @RequestParam(required = false) Integer age,
                               @RequestParam(required = false) String breed) {

        return this.service.updatePet(id, name, age, breed);
    }
}
