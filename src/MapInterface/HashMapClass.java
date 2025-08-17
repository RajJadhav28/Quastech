package MapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapClass {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		map.put(5, "Mango");//duplicate value accepted.
		map.put(1, "Pineapple");//not allowed and replaced the value of key 1
		
		System.out.println("Iterating Hashmap:");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		System.out.println("=================================");
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(100, "Amit");
		map1.put(101, "Vijay");
		map1.put(102, "Rahul");
		
		for(Map.Entry m:map1.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
		map1.putIfAbsent(103, "Gaurav");
		System.out.println("After invoking putIfAbsent method:");
		for(Map.Entry m:map1.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
		HashMap<Integer, String> map2=new HashMap<Integer, String>();
		map2.put(104, "Ravi");
		map2.putAll(map1);
		System.out.println("After using putAll method:");
		for(Map.Entry m:map2.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		map2.remove(100);
		System.out.println("After removing the key:");
		for(Map.Entry m:map2.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		map2.remove(104,"Ravi");
		System.out.println("After removing key-value:");
		for(Map.Entry m:map2.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
		map2.replace(102, "Gaurav");
		System.out.println("After using replace method:");
		for(Map.Entry m:map2.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		map2.replace(103, "Gaurav", "Ranjit");
		System.out.println("After using replace second type:");
		for(Map.Entry m:map2.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		map2.replaceAll((k,v)->"Ajay");
		System.out.println("After using replaceAll method:");
		for(Map.Entry m:map2.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		System.out.println("After using clone method:");
		HashMap<Integer, String> map3=(HashMap<Integer, String>)map2.clone();
		for(Map.Entry m:map3.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
	}
}
