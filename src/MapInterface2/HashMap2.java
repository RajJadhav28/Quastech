package MapInterface2;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101,"Vijay");    
	    map.put(102,"Rahul");  
	    map.put(103, "Gaurav");
	    System.out.println("Initial list of elements:"+map);
	    System.out.println("========================");
	    for(Map.Entry<Integer, String> m:map.entrySet()) {
	    	System.out.println(m.getKey()+":"+m.getValue());
	    }
	    System.out.println("===================");
	    System.out.println("After removing:");
	    map.remove(100);
	    for(Map.Entry m:map.entrySet()) {
	    	System.out.println(m.getKey()+":"+m.getValue());
	    }
	    System.out.println("===================");
	    System.out.println("After removing:");
	    map.remove(101,"Vijay");
	    for(Map.Entry m:map.entrySet()) {
	    	System.out.println(m.getKey()+":"+m.getValue());
	    }
	    System.out.println("===================");
	    System.out.println("After replacing:");
	    map.replace(102, "Suraj");
	    for(Map.Entry m:map.entrySet()) {
	    	System.out.println(m.getKey()+":"+m.getValue());
	    }
	    System.out.println("================");
	    System.out.println("Using ReplaceAll:");
	    map.replaceAll((k,v)->"Ajay");
	    for(Map.Entry m:map.entrySet()) {
	    	System.out.println(m.getKey()+":"+m.getValue());
	    }
	}
}
