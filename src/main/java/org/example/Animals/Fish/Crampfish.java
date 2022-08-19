package org.example.Animals.Fish;

public class Crampfish extends Fish {
    public Crampfish(String animalType) {
        super(animalType);
    }

    public void AboutCrampfish() {
        System.out.println(animalType+ " hide well in the sand");
    }

    public void CrampfishInfo() {
        AnimalInfo();
        AboutCrampfish();
    }
}
