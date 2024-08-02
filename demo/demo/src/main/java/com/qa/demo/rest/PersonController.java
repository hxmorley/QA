package com.qa.demo.rest;

import java.util.ArrayList;
import java.util.List;

import com.qa.demo.dtos.PersonDto;
import com.qa.demo.services.PersonService;
import org.springframework.http.HttpStatus;
import com.qa.demo.entities.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    private PersonService service;

    public PersonController (PersonService service){
        this.service = service;
    }

    @GetMapping("/person/getAll")
    public List<PersonDto> getAll(){
        return this.service.getAll();
    }

    @GetMapping("/person/{id}")
    public ResponseEntity<?> getPerson(@PathVariable Integer id) {
        return this.service.getPerson(id);
    }


    @PostMapping ("/addPerson")
    public ResponseEntity<Person> createPerson(@RequestBody Person newPerson){
        return this.service.createPerson(newPerson);
    }


    @DeleteMapping("/person/{id}")
    public ResponseEntity<?> removePerson(@PathVariable Integer id) {
        return this.service.removePerson(id);
    }

    @PatchMapping("/person/update/{id}")
    public Person updatePerson(@PathVariable int id,
                               @RequestParam(required = false) String name,
                               @RequestParam(required = false) Integer age,
                               @RequestParam(required = false) String job) {

        return this.service.updatePerson(id, name, age, job);
    }
}
