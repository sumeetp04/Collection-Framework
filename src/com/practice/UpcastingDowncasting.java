package com.practice;

public class UpcastingDowncasting {

    public static void main(String[] args) {
        // Upcasting: Reference of Member pointing to an Admin object
        Member mem1 = new Admin();

        // Calling the method with upcasting (polymorphism)
        mem1.sendmessage();  // Output: Admin

        // Checking if mem1 is an instance of Admin before downcasting
        if (mem1 instanceof Admin) {
            Admin admin1 = (Admin) mem1;  // Safe downcasting
            admin1.sendmessage();         // Output: Admin
        } else {
            System.out.println("mem1 is not an instance of Admin.");
        }
    }
}

class Member {
    void sendmessage() {
        System.out.println("Member");
    }
}

class Admin extends Member {
    @Override
    void sendmessage() {
        System.out.println("Admin");
    }
}
