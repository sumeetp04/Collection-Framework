package com.array;

public class BubbleSort {

    public static void main(String[] args) {
        int a[] = { 6, 1, 3, 10, 15};

        System.out.println("Original Array:");
        printArray(a);

        // Perform Bubble Sort
        bubbleSort(a);

        System.out.println("Sorted Array:");
        printArray(a);
    }

    // Bubble Sort Function
    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {  // Reduce comparisons each pass
                if (a[j] < a[j + 1]) {  // Compare adjacent elements
                    // Swap elements
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    // Function to Print Array
    public static void printArray(int[] a) {
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
