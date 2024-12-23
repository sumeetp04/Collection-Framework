package te_19_12_24_Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
	
		List <Integer> list = new ArrayList<>();
		list.add(20);
		list.add(40);
		list.add(10);
		
		Object[] arrays =  list.toArray();
		list.toArray(new Integer[0]);
		//Collections.sort(list);
		list.sort(null);
		System.out.println(list);
		


	
		
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(0));
	}
	for(int num :list) {
		System.out.println(num);
	}
	list.set(2, 22);
		System.out.println(list);
		
		System.out.println(list.size());
	List<String> list = new ArrayList<>(11);
		System.out.println(list.getClass().getName());

		List<String> list1 = Arrays.asList("Monday","Tuesday","Wednesday") ;
		System.out.println(list1.getClass().getName());
		
		list1.set(1,"Thursday");
		System.out.println(list1.get(1));

		String [] array = {"Apple","Banana","Cherry"};
		List<String> list2 = Arrays.asList(array);
		System.out.println(list2.getClass().getName());

		List<Integer> list3 = List.of(1,2,3,4,5);
		System.out.println(list3);

		System.out.println(list.indexOf(10));
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.remove(2);
		list.remove(Integer.valueOf(10));		
		System.out.println(list);
	 */