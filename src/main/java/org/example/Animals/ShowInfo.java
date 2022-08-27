package org.example.Animals;

import org.example.Animals.Beasts.Cat;
import org.example.Animals.Beasts.Giraffe;
import org.example.Animals.Beasts.Zebra;
import org.example.Animals.Birds.Eagle;
import org.example.Animals.Birds.Peacock;
import org.example.Animals.Birds.Toucan;
import org.example.Animals.Fish.Crampfish;
import org.example.Animals.Fish.Shark;
import org.example.Animals.Fish.Sprat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShowInfo {
    public void ShowInfoOfAnimals() {
        while (true) {
            try {
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
                        System.exit(0);
                    default:
                        System.out.println("Wrong number");
                }
            } catch (InputMismatchException e) {
                System.out.println("You didn't enter a number");
            }
        }
    }
}
