package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Renter;

public class Rent {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Renter[] rooms = new Renter[10];

        System.out.print("How many rooms will be rented?: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nRent #" + i);
            System.out.print("Name: ");
                String name = sc.next();
            System.out.print("Email: ");
                String email = sc.next();
            System.out.print("Room: ");
                int room = sc.nextInt();
            rooms[room] = new Renter(name, email);
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i] != null) {
                System.out.println(i + ": " + rooms[i].getName() + ", " + rooms[i].getEmail());
           }
        }

        sc.close();
    }
     
}