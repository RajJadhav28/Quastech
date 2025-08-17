package Queue1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Pro3 {
	public static void main(String[] args) {
		Deque<String> q=new ArrayDeque<String>();
		  q.add("Ravi");    
		  q.add("Vijay");     
		  q.add("Ajay");
		  Iterator<String> itr=q.iterator();
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
		// Displaying the head of the queue using element() method  
	    // This method throws an exception if the queue is empty
		  System.out.println("Head:"+q.element());
		  
		// Displaying the head of the queue using peek() method  
	    // This method returns null if the queue is empty
		  System.out.println("head:"+q.peek());
		  
		// Removing the head of the queue using remove() method  
	    // This method throws an exception if the queue is empty 
		  q.remove();
		 
		  System.out.println("Iterating the elements:");
		  Iterator itr2=q.iterator();
		  while(itr2.hasNext()) {
			  System.out.println(itr2.next());
		  }
		  q.add("Jay");
		  System.out.println("Iterating the elements:");
		  Iterator itr3=q.iterator();
		  while(itr3.hasNext()) {
			  System.out.println(itr3.next());
		  }
		// Removing the head of the queue using poll() method  
	    // This method returns null if the queue is empty
		   q.poll();
		   System.out.println("Iterating the elements:");
		   Iterator<String> itr4=q.iterator();
		   while(itr4.hasNext()) {
			   System.out.println(itr4.next());
		   }
		   System.out.println("Iterating the next element deque:");
		   Deque<String> dq=new ArrayDeque<String>();
		   dq.add("Sameer");
		   dq.add("Pooja");
		   dq.add("Ram");
		   dq.add("Rohini");
		   Iterator itr5=dq.iterator();
		   while(itr5.hasNext()) {
			   System.out.println(itr5.next());
		   }
		   dq.offerFirst("Arvind");
		   dq.offerLast("Rahul");
		   System.out.println("Iterating the elements:");
		   Iterator itr6=dq.iterator();
		   while(itr6.hasNext()) {
			   System.out.println(itr6.next());
		   }
		   dq.pollFirst();
		   dq.pollLast();
		   
		   System.out.println("Iterating the elements:");
		   Iterator itr7=dq.iterator();
		   while(itr7.hasNext()) {
			   System.out.println(itr7.next());
		   }
		   System.out.println("First element:"+dq.peekFirst());
		   System.out.println("Last element:"+dq.peekLast());
		   
	}
}
