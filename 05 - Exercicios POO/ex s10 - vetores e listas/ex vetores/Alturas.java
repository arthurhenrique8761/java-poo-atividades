package application;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas?: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        double totalHeight = 0;
        double minorAge = 0;
        String minorName = "";

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            names[i] = sc.next();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();
            if (age[i] < 16 ) {
                minorAge++;
                minorName += names[i] + "\n";
            }
            System.out.print("Altura: ");
            height[i] = sc.nextDouble();
            totalHeight += height[i];
        }

        System.out.printf("\nAltura média: %.2f\n", (totalHeight / n));

        System.out.print("Pessoas com menos de 16 anos: " + (minorAge/n)*100 + "%\n");

        if (minorAge > 0) {
            System.out.println(minorName);
        }

        sc.close();
    }
     
}