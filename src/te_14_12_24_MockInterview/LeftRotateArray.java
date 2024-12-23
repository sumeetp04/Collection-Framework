package te_14_12_24_MockInterview;


import java.util.Arrays;

public class LeftRotateArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int k = 2; // Number of positions to rotate

		rotateLeft(arr, k);

		System.out.println("Rotated Array: " + Arrays.toString(arr));
	}

	public static void rotateLeft(int[] arr, int k) {
		int n = arr.length;

		// Outer loop runs k times
		for (int i = 0; i < k; i++) {
			// Store the first element (to move it to the end)
			int temp = arr[0];

			// Inner loop shifts all elements one position to the left
			for (int j = 0; j < n - 1; j++) {
				arr[j] = arr[j + 1];
			}

			// Move the first element to the end
			arr[n - 1] = temp;
		}
	}
}
