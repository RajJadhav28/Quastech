package MapInteface1;

import java.util.Map;

public class HashMap {
	public static void main(String[] args) {
		java.util.HashMap<Integer, String> map=new java.util.HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		map.put(5, "Mango");//duplicate value accepted.
		map.put(1, "Pineapple");
		
		System.out.println("Iterating HashMap:");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		System.out.println("=======================");
		java.util.HashMap<Integer, String> map1=new java.util.HashMap<Integer, String>();
		map1.put(100, "Amit");
		map1.put(101, "Vijay");
		map1.put(102, "Rahul");
		
		for(Map.Entry m:map1.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
		java.util.HashMap<Integer, String> map2=new java.util.HashMap<Integer, String>();
		map2.put(104, "Ravi");
		map2.putAll(map1);
		System.out.println("After using putAll method:");
		for(Map.Entry m:map2.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		System.out.println("========================");
		map2.remove(100);
		for(Map.Entry m:map2.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
	}
}
