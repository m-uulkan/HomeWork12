package com.example.homework12;

public class Person {
     private Animal animal;
     private String name;
     private int age;



    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
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
    public void CallMethods(){
        animal.AnimalMinus();
        animal.AnimalPLus();
    }
    public void CallMethodsOfKitten(){
        animal.AnimalPLus();
        animal.AnimalMinus();
    }
}
