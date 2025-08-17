package Stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Pro3 {
	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<Integer>();
		boolean result=stk.empty();
		System.out.println("Is stack empty:"+result);

		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		
		System.out.println("Elements in stack:"+stk);
		result=stk.empty();
		System.out.println("Is stack empty:"+result);
		int num=stk.peek();
		System.out.println("Element at top:"+num);
		stk.forEach(a->{
			System.out.println(a);
		});
		int location=stk.search(3);
		System.out.println("Location of 3:"+location);
		
		ListIterator<Integer>itr=stk.listIterator(stk.size());
		while(itr.hasPrevious()) {
			Integer avg=itr.previous();
			System.out.println(avg);
		}
	}
}
