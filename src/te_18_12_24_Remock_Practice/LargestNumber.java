package te_18_12_24_Remock_Practice;


public class LargestNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int arr[] = {3,4,2,1,5};
	
	int firstl = Integer.MIN_VALUE,secondl = Integer.MIN_VALUE;
	for (int i = 0; i < arr.length; i++) {
	    int num = arr[i]; // Accessing the current element
		if(num>firstl) {
			secondl = firstl;
			firstl = num;
	}
		else if (num>secondl && num<firstl ){
			secondl = num;
		}
	}
		System.out.println(firstl);
		System.out.println(secondl);
	}
	
}


	


