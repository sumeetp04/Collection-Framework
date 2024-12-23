package com.abstraction;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display options to the user
        System.out.println("Choose a payment method:");
        System.out.println("1. PhonePe");
        System.out.println("2. GooglePay");
        System.out.println("3. Paytm");

        int choice = scanner.nextInt(); // Get user's choice

        // Use PaymentFactory to create the selected payment method
        PaymentFactory factory = new PaymentFactory();
        Payments selectedPaymentMethod = factory.getPaymentMethod(choice);

        
        if (selectedPaymentMethod == null) {
            System.out.println("Invalid choice! Exiting...");
            scanner.close();
            return;
        }

        // Prompt user for payment amount
        System.out.print("Enter the payment amount: ");
        double amount = scanner.nextDouble();

        // Process payment
        PaymentMethods paymentMethods = new PaymentMethods();
        paymentMethods.processPayment(selectedPaymentMethod, amount);

        scanner.close();
    }
}
