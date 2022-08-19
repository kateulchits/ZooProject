package org.example.Animals.Beasts;

public class Zebra extends Beast {
    public Zebra(String animalType) {
        super(animalType);
    }

    public void AboutZebra() {
        System.out.println(animalType + " has completely black skin\n");
    }

    public void ZebraInfo() {
        AnimalInfo();
        AboutZebra();
    }
}
