package Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pro5 {
	public static void main(String[] args) {
		Set<Integer> a=new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,9,0}));
		Set<Integer>b=new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {1,3,7,5,4,0,7,5}));
		
		Set<Integer> union=new  HashSet<Integer>(a);
		union.addAll(b);
		System.out.println(union);
		
		Set<Integer> insertion=new  HashSet<Integer>(a);
		insertion.retainAll(b);
		System.out.println("Insertion of two sets:");
		System.out.println(insertion);
		
		Set<Integer> difference=new  HashSet<Integer>(a);
		difference.removeAll(b);
		System.out.println("Difference of the two sets:");
		System.out.println(difference);
	}
}
