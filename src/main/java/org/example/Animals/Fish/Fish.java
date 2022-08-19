package org.example.Animals.Fish;

import org.example.Animals.Animal;

public class Fish extends Animal {
    String breathe = "water";
    String walk = "in the water";

    public Fish(String animalType) {
        super(animalType);
    }

    public void AnimalInfo() {
        animalTypeInfo();
        breatheInfo(breathe);
        walkInfo(walk);
    }
}
