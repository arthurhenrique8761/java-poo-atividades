package application;

import entities.*;

public class Program {

    public static void main(String[] agrs) {
        System.out.println("Dog:");
        Pets capeta = new Dog("capeta", "vira-lata", 16, "Osso");
        System.out.println(capeta);

        System.out.println();

        System.out.println("Bird:");
        Pets xisNove = new Bird("Xis-Nove", "Gavião", 18, 1.90);
        System.out.println(xisNove);

    }
}
