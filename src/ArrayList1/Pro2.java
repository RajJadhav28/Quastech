package ArrayList1;

import java.util.ArrayList;
import java.util.Iterator;

public class Pro2 {
	public static void main(String[] args) {
//		ArrayList<String> al=new ArrayList<String>();
//		al.add("Ajay");
//		System.out.println(al);
//		;
//		al.add(1,"Gaurav");
//		System.out.println(al);
//		ArrayList<String>al2=new ArrayList<String>();
//		al2.add("Sonoo");
//		al2.add("Hanumant");
//		
//		al.addAll(al2);
//		System.out.println(al);
//		al.removeIf(str->str.contains("Ajay"));
//		System.out.println(al);
		
		ArrayList<String>al=new ArrayList<String>();
		al.add("Apple");
		al.add("Grapes");
		al.add("Banana");
		al.add("Orange");
		al.add("Mango");
		
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ArrayList<String>al2=(ArrayList<String>)al.clone();
		System.out.println(al2);
		System.out.println(al.subList(1, 3));
	}
}
