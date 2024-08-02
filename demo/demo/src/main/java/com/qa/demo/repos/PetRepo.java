package com.qa.demo.repos;

import com.qa.demo.entities.Person;
import com.qa.demo.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepo extends JpaRepository<Pet, Integer> {
}
