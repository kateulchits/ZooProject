package org.example.Animals;

import java.util.ArrayList;

public class ListOfAnimals {
    public void ShowList() { //full list
        ArrayList<String> listOfAnimals = new ArrayList<>();
        listOfAnimals.add("1. Cat");
        listOfAnimals.add("2. Zebra");
        listOfAnimals.add("3. Giraffe");
        listOfAnimals.add("4. Shark");
        listOfAnimals.add("5. Crampfish");
        listOfAnimals.add("6. Sprat");
        listOfAnimals.add("7. Eagle");
        listOfAnimals.add("8. Toucan");
        listOfAnimals.add("9. Peacock");

        for (String animal : listOfAnimals) {
            System.out.println(animal);
        }
        System.out.println("0. Exit");
    }
}
