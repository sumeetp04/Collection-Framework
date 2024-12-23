
//ConstructorRecurssion {

	class Student {
	    int id;

	    // Constructor that recursively calls itself
	    public Student() {
	        System.out.println("Creating Student object...");
	        new Student();  // Recursive call
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Student s = new Student();  // Infinite recursion
	    }
	    
	}
