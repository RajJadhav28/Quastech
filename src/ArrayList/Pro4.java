package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Pro4 {
	public static void main(String[] args) {
		 ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
         list.add("Ravi");//Adding object in arraylist  
         list.add("Vijay");  
         list.add("Ravi");  
         list.add("Ajay");
         System.out.println("Is ArrayList Empty: " + list.isEmpty()); 
         ListIterator<String> list1=list.listIterator(list.size());
         Iterator itr=list.iterator();
         while(list1.hasPrevious()) {
        	 String str=list1.previous();
        	 System.out.println(str);
         }
         System.out.println("Using lambda expression through forEach loop:");
         list.forEach(a->{
        	 System.out.println(a);
         });
         System.out.println("Traversing list through for loop:");  
         for(int i=0;i<list.size();i++)  
         {  
          System.out.println(list.get(i));     
         }  
      // Create an ArrayList of Integer type with an initial capacity of 10  
         ArrayList<Integer> al = new ArrayList<Integer>(10);         
         // Print the size of the ArrayList using the size() method  
         System.out.println("The size of the array is: " + al.size());    
	}
}
