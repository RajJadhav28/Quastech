package ArrayList;

import java.util.ArrayList;
//Add elements.
public class Pro2 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ajay");
		System.out.println("Initial list of elements:"+al);
		//Adding elements to the end of the list
		al.add("Rahul");
		System.out.println(al);
		al.add(1,"Gaurav");
		System.out.println(al);
		ArrayList<String>al2=new ArrayList<String>();
		al2.add("Sonoo");
		al2.add("Hanumant");
		//Adding second list element to the first list
		al.addAll(al2);
		System.out.println("Adding second list element to the first list:"+al);
		//Adding second list elements to the first list at specific position.
		ArrayList<String>al3=new ArrayList<String>(al2);
		al.addAll(1,al3);
		System.out.println("Adding second list elements"
				+ " to the first list at specific position:"+al);
		//Remove elements
		al.remove("Ajay");//removing character
		System.out.println(al);
		al.remove(1);//removing the string at specific index position.
		System.out.println(al);
		ArrayList<String>al4=new ArrayList<String>();
		al4.add("Raj");
		al4.add("Kision");
		al4.add("Shyam");
		al4.add("Kaira");
		al.addAll(al4);
		System.out.println("Updated List:"+al);
		al.retainAll(al4);
		System.out.println(al4);
		al.removeAll(al4);
		System.out.println(al);
		al.removeIf(str->str.contains("Sanoo"));
		System.out.println(al);
//		al.clear();
//		System.out.println("After invoking clear method:"+al);
	}
}
