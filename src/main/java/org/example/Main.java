package org.example;

import org.example.Animals.ListOfAnimals;
import org.example.Animals.ShowInfo;

public class Main {
    public static void main(String[] args) {
        ListOfAnimals list = new ListOfAnimals();
        list.ShowList();

        ShowInfo info = new ShowInfo();
        info.ShowInfoOfAnimals();
    }
}