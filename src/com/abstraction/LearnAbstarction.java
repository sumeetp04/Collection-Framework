package com.abstraction;

import java.util.Scanner;


// Chandana mam program
class DecidePaymentProcess{
	public static Payment decidingPaymentProcess(String payThrough) {
		if(payThrough.equalsIgnoreCase("phonepe")) {
			return new PhonePe();
		}
		else if(payThrough.equalsIgnoreCase("googlepay")) {
			return new GooglePay();
		}
		return new Paytm();
	}
}

public class LearnAbstarction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the application through which you need to process payment");
			String payThrough = sc.next();
			
			Payment paymentProcess = DecidesPaymentProcess.decidePaymentProcess(PayThrough);
			paymentProcess.validateUser();
			paymentProcess.processPayment();
	}

}
