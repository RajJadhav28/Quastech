package Set1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pro1 {
	public static void main(String[] args) {
		Set<Integer> a=new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,9,0}));
		Set<Integer>b=new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {1,3,7,5,4,0,7,5}));
		Set<Integer> union=new HashSet<Integer>(a);
		union.addAll(b);
		System.out.println("Union of two sets:");
		System.out.println(union);
		
		Set<Integer> intersection=new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.println("Intersection of the two sets");
		System.out.println(intersection);
		
		Set<Integer> difference=new HashSet<Integer>(a);
		difference.removeAll(b);
		System.out.println("Difference of the two sets:");
		System.out.println(difference);
		
		Set<Integer> difference1=new HashSet<Integer>(a);
		difference1.remove(b);
		System.out.println("Removing all b elements:");
		System.out.println(difference1);
	}
}
