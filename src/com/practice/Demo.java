package com.practice;

class A{
	int a = 10;
	static int s = 18;
	
	public static void m1() {
		System.out.println("m1() from A!");
	}
	public static void m2() {
		System.out.println("m2() from A!");
	}
}
class B extends A{
	int a = 20;
	static int s = 28;
	
	public static void m1() {
		System.out.println("m1() from B!");
	}
	public static void m2() {
		System.out.println("m2() from B!");
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		//B b1 = (B) new A();
		A a2 = new B();
		B b2 = new B();
		
		System.out.println(a1.a);
		System.out.println(a2.a);
		System.out.println(b2.a);
		
		System.out.println(a1.s);
		System.out.println(a2.s);
		System.out.println(b2.s);
		/*
		 * For Variable hiding the type of the reference variable matters
		 * 
		 * Case 1: A a1 = new A();Here refernce variable is of type and also the object created.but only
		 * refernce variable type is considered.So,when we call a1.a;we get the results 10;
		 * 
		 * Case 2 : A a2 = new B(); here the reference type is of A class , but the object is of B class and as 
		 * is varr hiding only reference type is 
		 * considered , when we perform a2.a we still get 10. data of a stored in classs B 
		 * object is not considered
		 * 
		 * 
		 * case 3: B b2 = new B(); In this a case reference and object are of same type so  B class 'a' var by
		 * 
		 * 
		 * Runtime Polymorophsim can be seen using method overriding , but for method overriding to happen 
		 * upcasted reference is required 
		 * 
		 * without upcasting there is no method overriding :"
		 * 
		 * At the compile time its is decided that m2() method of class A will get executed 
		 * But this decision  was changed at the Runtime and Overridden version of 
		 * m2() method is the child class was executed:"
		 */
		
		a1.m1();
		a2.m1();
		b2.m1();
		
		a1.m2();
		a2.m2(); // method overriding
		b2.m2();
		/* 
		 *Runtime polymorphism can be seen using method overriding, but for method overriding to happen upcasted
		 *  refernce is required.
		 *  
		 *  Without upcasting there is no method overriding.
		 */ 
		
		/*  At the compile time it is decided that m2() method of class A will get executed.But this decision
		 *  that m2() method of class A  will get executed.But this decision was changed at the Runtime and 
		 *  overriden version of m2() method in the child class was executed.
		 * */
	}

}
