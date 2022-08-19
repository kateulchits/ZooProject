package org.example.Animals.Birds;

public class Toucan extends Bird {
    public Toucan(String animalType) {
        super(animalType);
    }

    public void AboutToucan() {
        System.out.println(animalType+ " are very noisy");
    }

    public void ToucanInfo() {
        AnimalInfo();
        AboutToucan();
    }
}
