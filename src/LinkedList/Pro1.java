package LinkedList;

import java.util.LinkedList;

public class Pro1 {
	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list);
		
		list.addFirst("this");
		list.addLast("List");
		System.out.println(list);
		
		System.out.println(list.size());
		list.forEach(a->{
			System.out.print(a+"->");
		});
		System.out.println("null");
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"->");
		}
		System.out.println("null");
		System.out.println(list);
		boolean found=false;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals("List")) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("Is present");
		}else {
			System.out.println("Not present");
		}
		
		for(int i=0;i<list.size();i++) {
			if(list.contains("list")) {
				System.out.println("Is present");
				break;
			}else {
				System.out.println("Not present");
				break;
			}
		}
		
		list.removeFirst();
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
	}
}
