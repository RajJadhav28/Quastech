package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Pro3 {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("Apple");
		al.add("Grapes");
		al.add("Banana");
		al.add("Orange");
		al.add("Mango");
		System.out.println("ArrayList elements:"+al);
		System.out.println("Traversing element using forEach loop:");
		for(String fruit:al) {
			System.out.println(fruit);
		}
		System.out.println("Iterating elements using while loop:");
		Iterator it=al.iterator();
		while(it.hasNext()) {//checks wheather ArrayList has next element
			System.out.println(it.next());//fetches the next element
		}
		ArrayList<String>al2=(ArrayList<String>)al.clone();
		System.out.println(al2);
		System.out.println(al.subList(1, 3));//last index is exclusive
	}
}
