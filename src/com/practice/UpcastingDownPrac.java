package com.practice;

//Parent class
class Animal {
 void speak() {
     System.out.println("This is an animal.");
 }
}

//Subclass 1
class Elephant extends Animal {
 void trumpet() {
     System.out.println("The elephant trumpets!");
 }
}

//Subclass 2
class Lion extends Animal {
 void roar() {
     System.out.println("The lion roars!");
 }
}

public class UpcastingDownPrac {
	    public static void main(String[] args) {
	        Animal myAnimal = new Elephant(); // Upcasting: Elephant is treated as an Animal

	        // Valid Cast: Casting back to Elephant
	        if (myAnimal instanceof Elephant) {
	            Elephant myElephant = (Elephant) myAnimal;
	            myElephant.trumpet();
	        }

	        // Invalid Cast: Trying to cast Elephant to Lion
	        try {
	            Lion myLion = (Lion) myAnimal; // This will throw ClassCastException
	            myLion.roar();
	        } catch (ClassCastException e) {
	            System.out.println("ClassCastException: Cannot cast Elephant to Lion.");
	        }
	    }
	}


