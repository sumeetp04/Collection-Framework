package com.abstraction;

class PaymentFactory {
    public Payments getPaymentMethod(int choice) {
        switch (choice) {
            case 1:
                return new PhonePe();
            case 2:
                return new GooglePay();
            case 3:
                return new Paytm();
            default:
                return null;
        }
    }
}
