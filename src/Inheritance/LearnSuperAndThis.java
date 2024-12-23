package Inheritance;
 class Aaa{
	//constructor
	Aaa(){
		System.out.println("Inside Aaa's counstru");
		System.out.println("this.hashCode():"+this.hashCode());
		System.out.println("super.hashCode()"+super.hashCode());
	}
 }
	//child class
	class Bbb extends Aaa{
		Bbb(){
			super();//explicit call to parent class constructor (optional as its automatically called)
			System.out.println("Inside Bbb's constructor");
			System.out.println("this.hashCode():"+this.hashCode());
			System.out.println("super.hashCode():"+super.hashCode());
		}
	}
 
 class LearnSuperAndThis{
	public static void main(String[]args ) {
		System.out.println("Creating obj of Bbb...");
		Bbb obj = new Bbb();
		Bbb obj1 = new Bbb();
	}
}
