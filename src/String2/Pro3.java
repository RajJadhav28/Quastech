package String2;

import java.util.HashMap;
import java.util.Map;


public class Pro3 {
		public static void main(String [] args) {
			String[]array= {"God","Dog","Cat","Dog","Cat"};
			Map<String, Integer>stringCount=new HashMap<String, Integer>();
			for(String str:array) {
				stringCount.put(str, stringCount.getOrDefault(str,0)+1);
				
			}
			System.out.println("Duplicate strings:");
			for(Map.Entry<String, Integer>entry:stringCount.entrySet()) {
				if(entry.getValue()>=1) {
					System.out.println(entry.getKey()+":"+entry.getValue()+"times");
				}
			}
	}
}
