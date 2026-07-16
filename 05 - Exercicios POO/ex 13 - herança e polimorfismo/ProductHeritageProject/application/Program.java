package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];

        for (int i = 0; i < products.length; i++) {
            System.out.print("\nCommon, used or imported(c/u/i)?: ");
            char opt = sc.next().charAt(0);
            System.out.printf("Product %d# data: \n", (i+1));
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            switch (opt) {
                case 'c':
                    products[i] = new Product(name, price);
                    break;
                case 'u':
                    System.out.print("Manufactured date (DD/MM/YYYY): ");
                    LocalDate manufactureDate = LocalDate.parse(sc.next(), fmt1);
                    products[i] = new UsedProduct(name, price, manufactureDate);
                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    products[i] = new ImportedProduct(name, price, customsFee);
                    break;
            }
        }

        System.out.println("\nPrice Tags:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
