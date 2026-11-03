
package com.futureskillit.assignments;

import java.util.Scanner;

public class ATM_Withdrawal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 200000.0;
        int correctPIN = 1234;

        System.out.print("Enter your PIN: ");
        int pin = sc.nextInt();

        if (pin == correctPIN) {

            System.out.println("Login successful.");

            System.out.print("\nEnter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                System.out.println("Invalid withdrawal amount.");
            }
            else if (amount > balance) {
                System.out.println("Insufficient balance.");
                System.out.println("Available Balance: " + balance);
            }
            else if (amount % 100 != 0) {
                System.out.println(
                    "Invalid amount. Please enter multiples of 100."
                );
            }
            else {
                balance = balance - amount;

                System.out.println("Withdrawal successful.");
                System.out.println("Withdrawn Amount  : " + amount);
                System.out.println("Remaining Balance : " + balance);
            }

        } else {
            System.out.println("Invalid PIN. Access denied.");
        }

        sc.close();
    }
}
