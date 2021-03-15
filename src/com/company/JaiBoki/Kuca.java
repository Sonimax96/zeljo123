package com.company.JaiBoki;

import java.util.Scanner;

public class Kuca {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare the monthly interest rate based on the yearly
        final double monthly_rate = 0.00417;

        // Prompt the user to enter how much he wants to invest
        System.out.print("Enter how much you want to save each month: ");
        double savingsAmount = input.nextDouble();
        System.out.print("Enter how much is interest yearly: ");
        double yearlyinterest = input.nextDouble();

        // Compute first month account value
        double total = 100 * (1 + monthly_rate);
        // Compute second month account value
        total = (100 + total) * (1 + monthly_rate);
        // Compute third month account value
        total = (100 + total) * (1 + monthly_rate);
        // Compute forth month account value
        total = (100 + total) * (1 + monthly_rate);
        // Compute fifth month account value
        total = (100 + total) * (1 + monthly_rate);
        // Compute sixth month account value
        total = (100 + total) * (1 + monthly_rate);

        // Display result
        System.out.println("If you put aside " + savingsAmount + " each month, you will have " + total + " after 6 months!");

    }

}