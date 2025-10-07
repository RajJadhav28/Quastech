package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Pro2 {
	public static void main(String[] args) {
		LinkedList<String>al=new LinkedList<String>();
		al.add("Ravi");
		al.add("Ramesh");
		al.add("Mukesh");
		al.add("Vijay");
		System.out.println(al);
		al.removeIf(str->str.contains("Ravi"));
		System.out.println(al);
		boolean found=false;
		for(int i=0;i<al.size();i++) {
			if(al.get(i)=="Ramesh") {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("Is present");
		}else {
			System.out.println("Not present");
		}
		for(int i=0;i<al.size();i++) {
			if(al.contains("Ramesh")) {
				System.out.println("Is present");
				break;
			}else {
				System.out.println("Not present");
				break;
			}
		}
		
		System.out.println("Before update:"+al.get(1));
		al.set(1, "Nitin");//It replaces the element at the specified position
						   //in a list with the specified element.
		System.out.println(al);
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		
		LinkedList<String>al2=(LinkedList<String>)al.clone();
		System.out.println("After cloning:"+al2);
		
		System.out.println(al2.indexOf("Nitin"));
		
		Iterator<String>itr=al2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Using forEach with lambda");
		al2.forEach(a->{
			System.out.println(a);
		});
		System.out.println("Descending Iterator:");
		Iterator i=al2.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("=============");
		Iterator i2=al2.listIterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}
}
