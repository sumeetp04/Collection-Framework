package te_19_12_24_Collection_Framework;

import java.util.*;

public class Iterable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String string = " Hello World ";
//		String[] result = string.split("\\s+"); // Split by one or more spaces
//
//		for (String str : result) {
//		    System.out.print(str); // Print each substring
//		}
		HashSet<Integer> Hashset = new HashSet<>();
		Hashset.add(10);
		Hashset.add(20);
		Hashset.add(30);
		Hashset.add(30);
		Hashset.add(50);
		
		System.out.println(Hashset);
		System.out.println(Hashset.contains(10));//check if the value is present
		//Hashset.remove(20);//remove the value
		System.out.println(Hashset);
		System.out.print(Hashset.isEmpty());
		
		for(int num:Hashset) {
			System.out.println(num);//iterating through hashsets
		
		}
		System.out.println(Hashset.size());//size of the hashset
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		System.out.println("LinkedHashSet: ");
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(30);
		set.add(50);
		System.out.println(set);
	}

}
