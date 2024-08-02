package com.qa.demo.dtos;

import com.qa.demo.entities.Person;
import com.qa.demo.entities.Pet;

public class PetDto {

    private Integer id;

    private String name;

    private int age;

    private String breed;

    public PetDto(){
    }

    public PetDto(Pet pet){
        this.id = pet.getId();
        this.name = pet.getName();
        this.age = pet.getAge();
        this.breed = pet.getBreed();
    }

    public PetDto(Integer id, String name,int age, String breed){
        this.id = id;
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}