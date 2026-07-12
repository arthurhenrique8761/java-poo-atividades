package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNum = sc.nextInt();
        System.out.print("Enter account holder: ");
        String name = sc.next();

        Account account = new Account(accountNum, name);

        System.out.print("Is there an initial withdraw (y/n): ");
        String opt = sc.next();

        if (opt.equals("y")) {
            System.out.print("Enter the initial value: ");
            double balance = sc.nextDouble();
            account.setBalanceDeposit(balance);
        }

        System.out.println("\nAccount data:");
        System.out.printf(account.accountData());

        /* deposit */
        System.out.print("\nEnter a deposit value: ");
        int deposit = sc.nextInt();
        account.setBalanceDeposit(deposit);
        System.out.println("Updated account data:");
        System.out.printf(account.accountData());

        /* withdraw */
        System.out.print("\nEnter a withdraw value: ");
        account.setBalanceWithdraw(sc.nextInt());
        System.out.println("Updated account data:");
        System.out.printf(account.accountData());
        
        sc.close();
    }

}