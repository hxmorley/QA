package com.qa.demo.services;


import com.qa.demo.entities.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;


//@Service
public class PersonServiceOld {

    private final List<Person> people = new ArrayList<>();

    public List<Person> getAll(){
        return this.people;
    }

    public Person get(int id){return this.people.get(id);}

    public ResponseEntity<?> getPerson( Integer id) {
        if (id == null || id < 0 || id >= this.people.size())
            return new ResponseEntity<>("No person found with id: " + id, HttpStatus.NOT_FOUND);
        else return ResponseEntity.ok(this.people.get(id));
    }

    public ResponseEntity<Person> createPerson( Person newPerson){
        this.people.add(newPerson);
        Person added = this.people.get(this.people.size() -1);
        return new ResponseEntity<>(added, HttpStatus.CREATED);
    }

    public Person updatePerson(int id, String name, Integer age, String job){
        Person toUpdate = this.people.get(id);

        if (name != null) toUpdate.setName(name);
        if (age != null) toUpdate.setAge(age);
        if (job != null) toUpdate.setJob(job);

        return toUpdate;
    }

    public ResponseEntity<?> removePerson(@PathVariable Integer id) {
        if (id == null || id < 0 || id >= this.people.size())
            return new ResponseEntity<>("No person found with id: " + id, HttpStatus.NOT_FOUND);
        else return ResponseEntity.ok(this.people.remove(id.intValue()));
    }
}
