package org.example;

import org.example.Animals.Beasts.Cat;
import org.example.Animals.Beasts.Giraffe;
import org.example.Animals.Beasts.Zebra;
import org.example.Animals.Birds.Eagle;
import org.example.Animals.Birds.Peacock;
import org.example.Animals.Birds.Toucan;
import org.example.Animals.Fish.Crampfish;
import org.example.Animals.Fish.Shark;
import org.example.Animals.Fish.Sprat;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    Cat cat = new Cat("Cat");
                    cat.CatInfo();
                    break;
                case 2:
                    Zebra zebra = new Zebra("Zebra");
                    zebra.ZebraInfo();
                    break;
                case 3:
                    Giraffe giraffe = new Giraffe("Giraffe");
                    giraffe.GiraffeInfo();
                    break;
                case 4:
                    Shark shark = new Shark("Shark");
                    shark.SharkInfo();
                    break;
                case 5:
                    Crampfish crampfish = new Crampfish("crampfish");
                    crampfish.CrampfishInfo();
                    break;
                case 6:
                    Sprat sprat = new Sprat("Sprat");
                    sprat.SpratInfo();
                    break;
                case 7:
                    Eagle eagle = new Eagle("Eagle");
                    eagle.EagleInfo();
                    break;
                case 8:
                    Toucan toucan = new Toucan("Toucan");
                    toucan.ToucanInfo();
                    break;
                case 9:
                    Peacock peacock = new Peacock("Peacock");
                    peacock.PeacockInfo();
                    break;
                case 0:
                    System.exit(0 );
                default:
                    System.out.println("Wrong number");
            }
        }
    }
}