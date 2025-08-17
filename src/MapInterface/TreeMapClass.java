package MapInterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {
	public static void main(String[] args) {
		TreeMap<Integer, String>hm=new TreeMap<Integer, String>();
		hm.put(101, "Amit");
		hm.put(103, "Ravi");
		hm.put(102, "Vijay");
		hm.put(104, "Rahul");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		System.out.println("Descending Map:");
		for(Map.Entry m:hm.descendingMap().entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		System.out.println("=========");
		System.out.println(hm.descendingMap());
		
		System.out.println("HeadMap:"+hm.headMap(102,true));
		System.out.println("tailmap:"+hm.tailMap(102,true));
		System.out.println("subMap:"+hm.subMap(101,false,102, true));
		
		
	}
}
