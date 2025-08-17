package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pro5 {
	public static void main(String[] args) {
		Deque<String> deque=new ArrayDeque<String>();
		
		//Offer element to the deque
		boolean result1=deque.offer("First");
		boolean result2=deque.offer("Second");
		boolean result3=deque.offer("Third");
		
		
		System.out.println("Was first offered successfully? "+result1);
		System.out.println("Was second offered successfully? "+result2);
		System.out.println("Was third offered successfully? "+result3);
		
		System.out.println("\nCurrent deque:"+deque);
		
		Deque<String>deque1=new ArrayDeque<String>();
		
		boolean result4=deque1.offerFirst("First");
		boolean result5=deque1.offerFirst("Start");
		
		boolean result6=deque1.offerLast("Second");
		boolean result7=deque1.offerLast("Last");
		
		System.out.println("Was first offered to front?"+result4);
		System.out.println("Was first offered to front?"+result5);
		
		System.out.println("Was first offered to end?"+result6);
		System.out.println("Was first offered to end?"+result7);
		
		System.out.println("\n Second deque:"+deque1);
	}
}
