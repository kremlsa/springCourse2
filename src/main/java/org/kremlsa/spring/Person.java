package org.kremlsa.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    //@Autowired
    //@Qualifier("dog")
    private Pet pet;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

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

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        this.pet = pet;
//        System.out.println("Person bean is created");
//    }

    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("Person bean is created");
    }

//    public Person() {
//        System.out.println("Person bean is created");
//    }

    public Pet getPet() {
        return pet;
    }

    //@Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person: Set Pet");
        this.pet = pet;
    }

    public void callYoutPet() {
        System.out.println("Hello");
        pet.say();
    }
}
