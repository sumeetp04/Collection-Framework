package te_10_12_24;


public class TryCatchExample {
	public static void main(String[] args) {
//		int numerator = 10;
//		int denominator = 0;
//		try {
//			
//			int result = numerator / denominator; // This will throw ArithmeticException
//			System.out.println("Result: " + result);
//		} catch (ArithmeticException excpetion) {
//			System.out.println("Error: Division by zero is not allowed.");
//			System.out.println("Exception Message: " + excpetion.getMessage());
//		}
//		System.out.println("Program continues...");
		int a = 0;
		int b = 0;
		int arr[] = new int[4];
		String str = null;
		try {
		//	int c = 8/a;	//arithmetic exc
//		int length = str.length();	//nullpointer
			b = arr[4];
//			System.out.println(c);	//outofbound
		} catch (ArithmeticException e) {
			System.out.println("check the letrals again"+e);
		}
		finally {
			System.out.println("it will print no matter what");
		}
		 System.out.println("rest of the code");
	}
}


