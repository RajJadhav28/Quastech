package MapInteface1;

import java.util.Map;

public class TreeMap {
	public static void main(String[] args) {
		java.util.TreeMap<Integer, String> tm=new java.util.TreeMap<Integer, String>();
		tm.put(101, "Amit");
		tm.put(103, "Ravi");
		tm.put(102, "Vijay");
		tm.put(104, "Rahul");
		
		for(Map.Entry m:tm.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		System.out.println("Descending Map:");
		for(Map.Entry m:tm.descendingMap().entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
	}
}
