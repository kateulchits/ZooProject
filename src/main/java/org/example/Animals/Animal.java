package org.example.Animals;

public abstract class Animal {
    protected String animalType;

    public Animal(String animalType) { //animal type
        this.animalType = animalType;
    }

    public void animalTypeInfo() {
        System.out.println("This animal is "+animalType);
    }

    public void breatheInfo(String breathe) {
        System.out.println("It breathes "+breathe);
    }

    public void walkInfo(String walk) {
        System.out.println("It moves "+walk);
    }
}
