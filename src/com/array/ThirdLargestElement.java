package com.array;

public class ThirdLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1,22,3,44,5,66};
		if(arr.length < 3) {
			System.out.println("Need atleast 3 elements in array to find third largest number");
		}
		else {
			int largest = FindThirdLargestElement(arr);
			System.out.println("the largest no. is :"+largest);
			
		}
		
	}
	private static int FindThirdLargestElement(int [] arr) {
		
		int first = Integer.MIN_VALUE ,second= Integer.MIN_VALUE ,third= Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num > first) {
				third = second;
				second = first;
				first = num;
			}
			else if (num>second && num<first ){
				third = second;
				second = num;
			}	
			else if (num>third && num<second) {
					third = num;
					}
				}
		return third;
				
		}
		
		
	}
	

