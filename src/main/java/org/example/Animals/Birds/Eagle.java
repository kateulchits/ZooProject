package org.example.Animals.Birds;

public class Eagle extends Bird {
    public Eagle(String animalType) {
        super(animalType);
    }

    public void AboutEagle() {
        System.out.println(animalType+ " fly at an altitude of 7-9 km");
    }

    public void EagleInfo() {
        AnimalInfo();
        AboutEagle();
    }
}
