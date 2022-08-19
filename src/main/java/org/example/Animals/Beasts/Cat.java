package org.example.Animals.Beasts;

public class Cat extends Beast {
    public Cat(String animalType) {
        super(animalType);
    }

    public void AboutCat() {
        System.out.println(animalType+ " says \"Meow\"\n");
    }

    public void CatInfo() {
        AnimalInfo();
        AboutCat();
    }


}
