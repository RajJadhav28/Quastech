package String3;

import java.util.HashMap;
import java.util.Map;

public class Pro4 {
	public static void main(String[] args) {
		String[]array= {"God","Dog","Cat","Dog","Cat"};
		Map<String, Integer>stringCount=new HashMap<String, Integer>();
		for(String str:array) {
			stringCount.put(str, stringCount.getOrDefault(str, 0)+1);
		}
		System.out.println(" String:");
		for(Map.Entry<String, Integer> m:stringCount.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
	}
}
