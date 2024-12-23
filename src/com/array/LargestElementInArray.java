package com.array;


public class LargestElementInArray {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6};
		int largest = findLargestElement(array);
		System.out.println("The largest element in the array is: " + largest);
	}

	public static int findLargestElement(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array must not be null or empty");
		}
		int a=MIN

		int max = arr[0]; 
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i]; 
			}
		}
		
		return max;

	}}