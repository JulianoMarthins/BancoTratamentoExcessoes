import entities.Account;
import entities.exception.DomainException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("Enter accoung date: ");

            System.out.print("\nNumber: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            double withdraw = sc.nextDouble();
            account.withdraw(withdraw);

            System.out.println("\n");

            System.out.println(account.toString());

        } catch (DomainException e) {
            System.out.println("ERROR " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("ERROR! Unexpected error ");
        }

        sc.close();
    }
}