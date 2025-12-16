package ArrayList1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class Pro5 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ajay");
		System.out.println("Initial list of elements:"+al);
		al.add("Rahul");
		System.out.println(al);
		al.add(1,"Gaurav");
		System.out.println(al);
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Sonu");
		al2.add("Hanumant");
		al.addAll(al2);
		System.out.println(al);
		ArrayList<String>al4=new ArrayList<String>();
		al4.add("Raj");
		al4.add("Kishion");
		al4.add("Shyam");
		al4.add("Kaira");
		al.addAll(al4);
		System.out.println(al);
		al.retainAll(al4);
		System.out.println(al4);
		al.removeIf(str->str.contains("Raj"));
		System.out.println(al);
		
		for(String name:al) {
			System.out.println(name);
		}
		System.out.println("==============");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ArrayList<String> al3=(ArrayList<String>)al.clone();
		System.out.println(al3);
		System.out.println(al.subList(1, 3));
		
		ListIterator<String>list1=al.listIterator(al.size());
		while(list1.hasPrevious()) {
			String str=list1.previous();
			System.out.println(str);
		}
		System.out.println("===========");
		al.forEach(a->{
			System.out.println(a);
		});
		System.out.println("=============");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}
