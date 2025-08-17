package Queue1;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Pro1 {
	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jay");
		queue.add("Rahul");
		// Displaying the head of the queue using element() method  
        // This method throws an exception if the queue is empty
		System.out.println("head:"+queue.element());
		
		// Displaying the head of the queue using peek() method  
        // This method returns null if the queue is empty
		System.out.println("head:"+queue.peek());
		
		System.out.println("Iterating the queue elements:");
		Iterator<String>itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Removing the head of the queue using remove() method  
        // This method throws an exception if the queue is empty 
		queue.remove();
		
		// Removing the head of the queue using poll() method  
        // This method returns null if the queue is empty 
		queue.poll();
		
		System.out.println("After removing the two elements:");
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
	}
}
