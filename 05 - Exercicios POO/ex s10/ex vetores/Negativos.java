package application;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for (int number : vect) {
            if (number < 0)
                System.out.println(number);
        }

        sc.close();
    }
     