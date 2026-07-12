package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?: ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        System.out.print("\nVALORES = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", sum);

        System.out.printf("MEDIA = %.2f\n", (sum/n));

        sc.close();
    }
     
}