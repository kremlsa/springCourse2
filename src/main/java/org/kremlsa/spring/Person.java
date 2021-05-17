package org.kremlsa.spring;

public class Person {
    private Pet pet;
    private String name;
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
//    public Person(Pet pet) {
//        this.pet = pet;
//        System.out.println("Person bean is created");

    public Person() {
        System.out.println("Person bean is created");
    }
//    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: Set Pet");
        this.pet = pet;
    }

    public void callYoutPet() {
        System.out.println("Hello");
        pet.say();
    }
}
