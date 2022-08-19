package org.example.Animals.Fish;

public class Sprat extends Fish {
    public Sprat(String animalType) {
        super(animalType);
    }

    public void AboutSprat() {
        System.out.println(animalType+ " are very tasty");
    }

    public void SpratInfo() {
        AnimalInfo();
        AboutSprat();
    }
}
