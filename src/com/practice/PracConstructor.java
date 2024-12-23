package com.practice;

public class PracConstructor {
	 int age;
	 String name;

	
	// common way to create a constructor
//	public PracConstructor(String name,int age) {
//		this.name = name;
//		this.age = age;
//		System.out.println("name :"+name+" age :"+age);
//	}
//	public static void main(String[] args) {
//		
//		PracConstructor c = new PracConstructor("Sumeet",26);
//		
//		}
	 // perfect way to create and initialize a constructor
	 public PracConstructor() {
		 
	 }
	 public PracConstructor(int age) {
		 this.age=age;
	 }
	 public PracConstructor(String name,int age) {
		 this(age);
		 this.name=name;
		
		 
		 
	 }
	 public static void main(String[] args) {
		PracConstructor p = new PracConstructor();
		System.out.println(p.name+p.age);
		
		}
	

}
