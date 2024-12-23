package com.array;

public class FindDuplicates {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 5};

		System.out.println("Duplicate elements are:");
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;

			// Check for duplicate from current position to end
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (isDuplicate) {
				boolean alreadyPrinted = false;

				// Check if this duplicate is already printed
				for (int k = 0; k < i; k++) {
					if (arr[i] == arr[k]) {
						alreadyPrinted = true;
						break;
					}
				}

				// Print the duplicate if it hasn't been printed before
				if (!alreadyPrinted) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
