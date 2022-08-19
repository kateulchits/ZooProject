package org.example.Animals.Birds;

public class Peacock extends Bird {
    public Peacock(String animalType) {
        super(animalType);
    }

    public void AboutPeacock() {
        System.out.println(animalType+ " sheds feathers");
    }

    public void PeacockInfo() {
        AnimalInfo();
        AboutPeacock();
    }
}
