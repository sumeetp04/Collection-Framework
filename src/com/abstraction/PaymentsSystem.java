package com.abstraction;


//Interface defining basic payment actions
interface Payments {
 void makePayment(double amount);
 String getPaymentMethod();
}

//Class representing PhonePe payment method
class PhonePe implements Payments {
 private String paymentMethod = "PhonePe";

 @Override
 public void makePayment(double amount) {
     System.out.println("Payment of Rs. " + amount + " made using " + paymentMethod);
 }

 @Override
 public String getPaymentMethod() {
     return paymentMethod;
 }
}

//Class representing Google Pay payment method
class GooglePay implements Payments {
 private String paymentMethod = "GooglePay";

 @Override
 public void makePayment(double amount) {
     System.out.println("Payment of Rs. " + amount + " made using " + paymentMethod);
 }

 @Override
 public String getPaymentMethod() {
     return paymentMethod;
 }
}

//Class representing Paytm payment method
class Paytm implements Payments {
 private String paymentMethod = "Paytm";

 @Override
 public void makePayment(double amount) {
     System.out.println("Payment of Rs. " + amount + " made using " + paymentMethod);
 }

 @Override
 public String getPaymentMethod() {
     return paymentMethod;
 }
}


//Utility class for processing payments
class PaymentMethods {
 public void processPayment(Payments paymentMethod, double amount) {
     System.out.println("Processing payment...");
     paymentMethod.makePayment(amount);
 }
}

