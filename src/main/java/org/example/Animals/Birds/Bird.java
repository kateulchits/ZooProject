package org.example.Animals.Birds;

import org.example.Animals.Animal;

public class Bird extends Animal {
    String breathe = "air";
    String walk = "in the sky";

    public Bird(String animalType) {
        super(animalType);
    }

    public void AnimalInfo() {
        animalTypeInfo();
        breatheInfo(breathe);
        walkInfo(walk);
    }
}
