package org.example.Animals.Fish;

public class Shark extends Fish {
    public Shark(String animalType) {
        super(animalType);
    }

    public void AboutShark() {
        System.out.println(animalType+ " do not distinguish color");
    }

    public void SharkInfo() {
        AnimalInfo();
        AboutShark();
    }
}
