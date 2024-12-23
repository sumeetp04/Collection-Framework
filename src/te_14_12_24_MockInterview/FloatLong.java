package te_14_12_24_MockInterview;

public class FloatLong {

	public static void main(String[] args) {
		//widening
		float largeFloat = 1e20f; // Very large float
		long longValue = (long) largeFloat; //
		System.out.println("Widening: "+longValue); // Output: Undefined, might be 9223372036854775807 or unpredictable
		// Implicit widening conversion from long to float
		
		//narrowing
		long longValue1 = 1234567l;
		float floatValue = longValue1;
		System.out.println("Narrowing: "+floatValue);
		// Explicitly narrowing conversion from long to float
	}

}
