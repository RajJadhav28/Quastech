package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Pro2 {
	public static void main(String[] args) {
		Queue<String> q=new LinkedList<String>();
		q.add("Amit");
		q.add("Vijay");
		q.add("Karan");
		q.add("Jay");
		q.add("Rahul");
		
		System.out.println("head:"+q.element());
		System.out.println("head:"+q.peek());
		System.out.println("Iterating the elements:");
		Iterator<String> itr=q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Using lambda expression:");
		q.forEach(a->{
			System.out.println(a);
		});
		q.remove();
		System.out.println(q);
		q.poll();
		System.out.println(q);
		
	}
	
}
