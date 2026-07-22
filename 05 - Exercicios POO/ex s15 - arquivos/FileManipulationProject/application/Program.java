package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        Locale.setDefault(Locale.US);
        String path = "C:\\temp\\sold.csv";

        // lê o arquivo linha por linha e salva os dados na lista
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] item = line.split(",");
                String name = item[0];
                double price = Double.parseDouble(item[1]);
                int quantity = Integer.parseInt(item[2]);
                products.add(new Product(name, price, quantity));
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro de Leitura: " + e.getMessage());
            System.exit(0);
        }


        String newPath = "C:\\temp\\summary.csv";

        // novo arquivo com as informações
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(newPath))) {
            for (Product product : products) {
                bw.write(product.toString());
                bw.newLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro de Gravação: " + e.getMessage());
            System.exit(0);
        }

    }
}
