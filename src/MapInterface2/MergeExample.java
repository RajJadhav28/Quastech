package MapInterface2;

import java.util.HashMap;

public class MergeExample {
	public static void main(String[] args) {
		HashMap<String, Integer>wordCount=new HashMap<String, Integer>();
		wordCount.merge("apple", 1, Integer::sum);
		wordCount.merge("mango", 2, Integer::sum);
		wordCount.merge("banana", 2, Integer::sum);
		System.out.println(wordCount);
	}
}
