package te_17_12_24_Collection_Framework;

import java.util.Iterator;

public class OurGenericList<T> implements Iterable {
	private T[] items;
	private int size;

	public OurGenericList(){
		// TODO Auto-generated method stub
		size = 0;
		items = (T[]) new Object[100];

	}
	public void add(T item) {
		items[size ++] = item;
	}
	public T getItemIndex(int index) {
		return items[index];
	}
	public  Iterator<T> iterator(){
		return 
	}
	
	private class OurGenericIterator implements Iterator<T>{
		this.list=list;
	}@Override
	public boolean hasNext() {
		System.out.println("Has next called");
		return index < list.size();
	}
	public T next() {
		
		return list.item[index];
		index
	}

	

}
