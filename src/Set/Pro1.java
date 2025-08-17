package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Pro1 {
	public static void main(String[] args) {
		HashSet<String> set=new  HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Four");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("=========================");
		HashSet<String>set2=(HashSet<String>)set.clone();
		System.out.println(set2);
		
		for(int i=0;i<set.size();i++) {
			if(set.contains("Five")) {
				System.out.println("Is present");
				break;
			}else {
				System.out.println("Not present");
				break;
			}
		}
		for(int i=0;i<set.size();i++) {
			if(set.isEmpty()) {
				System.out.println("Is empty");
				break;
			}else {
				System.out.println("Not empty");
				break;
			}
		}
	}
}
