package org.example.Animals.Beasts;

public class Giraffe extends Beast {
    public Giraffe(String animalType) {
        super(animalType);
    }

    public void aboutGiraffe() {
        System.out.println(animalType+ " loves raw onions");
    }

    public void GiraffeInfo() {
        AnimalInfo();
        aboutGiraffe();
    }
}
