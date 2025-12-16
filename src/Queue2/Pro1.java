package Queue2;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Pro1 {
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("Amit");
		pq.add("Vijay");
		pq.add("Karan");
		pq.add("Jay");
		pq.add("Rahul");
		// Displaying the head of the queue using element() method  
        // This method throws an exception if the queue is empty
		System.out.println("head:"+pq.element());
		System.out.println("head:"+pq.peek());
		
		System.out.println("======================");
		System.out.println("Iterating the queue elements:");
		Iterator<String>itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// Removing the head of the queue using remove() method  
        // This method throws an exception if the queue is empty 
		pq.remove();
		// Removing the head of the queue using poll() method  
        // This method returns null if the queue is empty 
		pq.poll();
		System.out.println("After removing the elements:");
		Iterator<String> itr2=pq.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
