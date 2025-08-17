package Set;
import java.util.*;

public class Pro3 {
	public static void main(String[] args) {
		TreeSet<String> al=new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		al.forEach(a->{
			System.out.println(a);
		});
		System.out.println("===================");
		Iterator i=al.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		TreeSet<Integer> set=new TreeSet<Integer>();    
        set.add(24);    
        set.add(66);    
        set.add(12);    
        set.add(15);
        System.out.println(set);
        System.out.println("Lowest value:"+set.pollFirst());
        System.out.println("Highest value:"+set.pollLast());
        System.out.println(set);
        
        TreeSet<Integer> set1=new TreeSet<Integer>();    
        set1.add(24);    
        set1.add(66);    
        set1.add(12);    
        set1.add(15);
        
        System.out.println("Reverse set:"+set1.descendingSet());
        System.out.println("Head Set:"+set1.headSet(24,true));
        System.out.println("Tail Set:"+set1.tailSet(15,true));
        System.out.println("Subset:"+set1.subSet(12, false,66, true));
        System.out.println("Tail Set:"+set1.tailSet(15,false));
        
        TreeSet<String> set2=new TreeSet<String>();  
        set2.add("A");  
        set2.add("B");  
        set2.add("C");  
        set2.add("D");  
        set2.add("E");
        System.out.println("Initial set:"+set2);
        System.out.println("Head Set:"+set2.headSet("C"));
        System.out.println("Tail Set:"+set2.tailSet("C"));
        System.out.println("SubSet:"+set2.subSet("A", "E"));
	}
}