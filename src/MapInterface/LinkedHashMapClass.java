package MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm=new LinkedHashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		hm.remove(102);
		System.out.println(hm.entrySet());
		hm.put(104, "Namit");
		System.out.println(hm.entrySet());
	}
}
