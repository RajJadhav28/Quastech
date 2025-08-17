package ArrayList;

import java.util.ArrayList;

public class Pro6 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ajay");
		System.out.println("Initial list of elements:"+al);
		
		al.add("Rahul");
		System.out.println(al);
		
		al.add(1,"Gaurav");
		System.out.println(al);
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Sanoo");
		al2.add("Hanumant");
		al.addAll(al2);
		//Adding second list element to the first list
	  System.out.println("Adding second list element to the first list:"+al);
	  
		//Adding second list elements to the first list at specific position.
	  ArrayList<String> al3=new ArrayList<String>();
	  al.addAll(1, al3);
	 System.out.println("Adding second list elements to the first list at specific position:"+al);
	 
	 al.remove("Ajay");
	 System.out.println(al);
	 
	 al.remove(1);
	 System.out.println(al);
	 
	 ArrayList<String> al4=new ArrayList<String>();
	 al4.add("Raj");
	 al4.add("Kision");
		al4.add("Shyam");
		al4.add("Kaira");
	 
		al.addAll(al4);
		System.out.println("Upadted list:"+al);
		al.removeIf(str->str.contains("Sanoo"));
		System.out.println(al);
		al.retainAll(al4);
		System.out.println(al4);
		al.removeAll(al4);
		System.out.println(al);
		System.out.println(al);
		al.removeIf(str->str.contains("Sanoo"));
		System.out.println(al);
	}
}
