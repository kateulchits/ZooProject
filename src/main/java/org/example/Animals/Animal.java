package org.example.Animals;

public abstract class Animal {
    protected String animalType;

    public Animal(String animalType) {
        this.animalType = animalType;
    }

    public void animalTypeInfo() { //main method for animalType
        System.out.println("This animal is "+animalType);
    }

    public void breatheInfo(String breathe) { //main method for animalBreathe
        System.out.println("It breathes "+breathe);
    }

    public void walkInfo(String walk) { //main method for animalWalk
        System.out.println("It moves "+walk);
    }
}
