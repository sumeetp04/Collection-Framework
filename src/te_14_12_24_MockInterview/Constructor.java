package te_14_12_24_MockInterview;

public class Constructor {


	public static void main(String[] args) {

		int a = 10;
		int b = 21;
		boolean res; // Use a boolean type for the result of the logical expression

		if (res = a++ > b++ || a > b) { // Corrected to assign a boolean value
			System.out.println("Condition is true");
		} else {
			System.out.println("Condition is false");
		}

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}