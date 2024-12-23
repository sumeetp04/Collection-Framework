package te_16_12_24_MockInterview;

public class Temp2 {
	static int age;  // Static variable
	String name;     // Non-static (instance) variable

	public static void main(String[] args) {
		// Directly initialize the static variable using the class name
		Temp2.age = 26;

		// Create an object to initialize and access the non-static variable
		Temp2 temp = new Temp2();
		temp.name = "Sumeet";

		// Print static and non-static variables
		System.out.println("Age: " + Temp2.age);    // Access static variable
		System.out.println("Name: " + temp.name);  // Access instance variable through the object
	}
}

