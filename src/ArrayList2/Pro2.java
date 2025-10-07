package ArrayList2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Pro2 {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("Apple");
		al.add("Grapes");
		al.add("Banana");
		al.add("Orange");
		al.add("Mango");
		System.out.println("ArrayList elements:"+al);
		System.out.println("Traversing elements using forEach loop:");
		for(String fruits:al) {
			System.out.println(fruits);
		}
		System.out.println("Iterating elements using while loop:");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ArrayList<String> al2=(ArrayList<String>)al.clone();
		System.out.println(al2);
		System.out.println(al.subList(1, 3));
		
		ArrayList<String> list=new  ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		System.out.println("Is ArrayList Empty:"+list.isEmpty());
		Iterator<String> itr1=list.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("List iterator:");
		ListIterator<String> list1=list.listIterator(2);
		while(list1.hasNext()) {
			System.out.println(list1.next());
		}
		System.out.println("hasPrevious:");
		while(list1.hasPrevious()) {
			System.out.println(list1.previous());
		}
	}
}
