package te_18_12_24_Remock_Practice;

import java.util.*;

public class SubsetOfString {
	
	public static void main(String[] args) {
		
		String str = "SMART";
		int length = str.length();
		int temp=0;
		String c[]=  new String[length*(length+1)/2]; // this is the formula for creating a subset.
		
		for(int i=0; i<length; i++) {
			for(int j=i; j<length; j++)
			{
				c[temp]= str.substring(i,j+1);
				temp++;
			}
		}
		for(int k=0; k<c.length;k++)
		{
			System.out.println(c[k]);
		}
    }
}