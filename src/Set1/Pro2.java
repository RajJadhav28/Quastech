package Set1;

import java.util.HashSet;
import java.util.Iterator;

public class Pro2 {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Four");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		HashSet<String> set1=new HashSet<String>();
		set1.add("Ravi");
		set1.add("Vijay");
		set1.add("Arun");
		set1.add("Sumit");
		System.out.println(set1);
		set.addAll(set1);
		System.out.println("Updates list:"+set);
		set.removeAll(set1);
		System.out.println("After removing all the elements of set1:"+set);
		
		set1.removeIf(str->str.contains("Vijay"));
		System.out.println("Upadted set1:"+set1);
//		set1.clear();
//		System.out.println("set1:"+set1);
		System.out.println("==================");
		HashSet<String> set2=(HashSet<String>)set.clone();
		System.out.println("set2:"+set2);
		
		for(int i=0;i<set.size();) {
			if(set.contains("Five")) {
				System.out.println("Is present");
				break;
			}else {
				System.out.println("Not present");
				break;
			}
		}
		for(int i=0;i<set.size();) {
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
