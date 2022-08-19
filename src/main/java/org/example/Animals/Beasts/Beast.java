package org.example.Animals.Beasts;

import org.example.Animals.Animal;

public class Beast extends Animal {
    String breathe = "air";
    String walk = "on the ground";

    public Beast(String animalType) {
        super(animalType);
    }

    public void AnimalInfo() {
        animalTypeInfo();
        breatheInfo(breathe);
        walkInfo(walk);
    }
}
