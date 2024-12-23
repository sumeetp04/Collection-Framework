package te_14_12_24_MockInterview;


// Class for basic arithmetic operations
public class ArithmeticOperations {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}
}
class Main {
	public static void main(String[] args) {
		ArithmeticOperations arithmetic = new ArithmeticOperations();
		AdvancedOperations advanced = new AdvancedOperations();

		int sum = arithmetic.add(10, 20);
		double result = advanced.power(2, 3);

		System.out.println("Sum: " + sum);
		System.out.println("2^3: " + result);
	}
}

	// Class for advanced operations
class AdvancedOperations {

		public double squareRoot(double number) {
			return Math.sqrt(number);
}

		public double power(double base, double exponent) {
			return Math.pow(base, exponent);
		}
}

	//		class Main {
	//	    public static void main(String[] args) {
	//	        Calculator calculator = new Calculator(); // Create an instance of the Calculator class
	//
	//	        // Call methods and print their results
	//	        int sum = calculator.add(10, 5);
	//	        System.out.println("Addition: " + sum);
	//
	//	        int difference = calculator.subtract(10, 5);
	//	        System.out.println("Subtraction: " + difference);
	//
	//	        int product = calculator.multiply(10, 5);
	//	        System.out.println("Multiplication: " + product);
	//
	//	        double quotient = calculator.divide(10, 5);
	//	        System.out.println("Division: " + quotient);
	//
	//	        // Example to handle division by zero
	//	        try {
	//	            calculator.divide(10, 0);
	//	        } catch (IllegalArgumentException e) {
	//	            System.out.println("Error: " + e.getMessage());
	//	        }
	//	    }






