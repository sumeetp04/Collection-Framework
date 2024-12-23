package com.array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeftRotateArrayByTwo {
	
	    public static void main(String[] args) {
	        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};

	        System.out.println("Original Array:");
	        printArray(arr);

	        // Convert array to list and rotate
	        List<Integer> list = Arrays.asList(arr);
	        Collections.rotate(list, -2);  // Negative value rotates left

	        System.out.println("Array after left rotation by 2 positions:");
	        printArray(list.toArray(new Integer[0]));
	    }

	    public static void printArray(Integer[] arr) {
	        Arrays.stream(arr).forEach(val -> System.out.print(val + " "));
	        System.out.println();
	    }
	}
