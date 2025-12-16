package Stack1;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Pro2 {
	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<Integer>();
		boolean result=stk.empty();
		System.out.println("Is stack empty:"+result);
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);
		
		System.out.println("Elements in stack:"+stk);
		result=stk.empty();
		System.out.println("Is stack empty:"+result);
		int top=stk.peek();
		System.out.println("Element at the top:"+top);
		int location=stk.search(78);
		System.out.println("location of 78:"+location);
		int size=stk.size();
		System.out.println("Size of the stack:"+size);
		System.out.println("====================");
		System.out.println("Using iterator:");
		Iterator< Integer> itr=stk.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("====================");
		System.out.println("using forEach:");
		stk.forEach(a->{
			System.out.println(a);
		});
		System.out.println("=================");
		ListIterator<Integer> list=stk.listIterator(stk.size());
		while(list.hasPrevious()) {
			System.out.println(list.previous());
		}
	}
}
