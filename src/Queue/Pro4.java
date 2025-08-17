package Queue;

import java.util.ArrayDeque;
import java.util.Deque;


public class Pro4 {
	public static void main(String[] args) {
		Deque<String>deque=new ArrayDeque<String>();
		deque.add("Ravi");
		deque.add("Vijay");
		deque.add("Ajay");
		deque.forEach(a->{
			System.out.println(a);
		});
		
//		deque.poll();
//		deque.pollFirst();
		deque.pollLast();
		System.out.println(deque);
	}
}
