package com.qa.demo.services;


import com.qa.demo.dtos.PersonDto;
import com.qa.demo.entities.Person;
import com.qa.demo.repos.PersonRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;



@Service
public class PersonService {

    private PersonRepo repo;


    public PersonService(PersonRepo repo) {
        this.repo = repo;
    }


    public List<PersonDto> getAll() {
        List<Person> found = this.repo.findAll();
        List<PersonDto> dtos = new ArrayList<>();

        for (Person person : found){
            dtos.add(new PersonDto(person));
        }
        return dtos;

    }


    public ResponseEntity<?> getPerson( Integer id) {
            return ResponseEntity.ok(this.repo.findById(id).get());
    }

    public ResponseEntity<Person> createPerson( Person newPerson){
        Person added = this.repo.save(newPerson);
        return new ResponseEntity<>(added, HttpStatus.CREATED);
    }

    public Person updatePerson(int id, String name, Integer age, String job){
        Person toUpdate = this.repo.findById(id).get();

        if (name != null) toUpdate.setName(name);
        if (age != null) toUpdate.setAge(age);
        if (job != null) toUpdate.setJob(job);

        return this.repo.save(toUpdate);
    }

    public ResponseEntity<?> removePerson(@PathVariable Integer id) {
        Person removePerson = this.repo.findById(id).get();
        this.repo.deleteById(id);
        return ResponseEntity.ok(removePerson);
    }
}
