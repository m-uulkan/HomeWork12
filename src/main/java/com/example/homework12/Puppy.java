package com.example.homework12;

public class Puppy implements Animal {
    private String name;
    private String poroda;
    private String colour;
    private String food;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public void AnimalPLus() {
        System.out.println("Щенок милый");

    }

    @Override
    public void AnimalMinus() {
        System.out.println("Вечно лает");
    }

    @Override
    public String toString() {
        return "Puppy{" +
                "name='" + name + '\'' +
                ", poroda='" + poroda + '\'' +
                ", colour='" + colour + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
