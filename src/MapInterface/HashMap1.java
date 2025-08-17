package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer, String>map=new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		map.put(5, "Mango");//duplicate value accepted.
		map.put(1, "Pineapple");
		
		System.out.println("Iterating Hashmap:");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		System.out.println("==================");
	}
}
