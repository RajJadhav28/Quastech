package String2;

import java.util.Arrays;

public class Pro7 {
	public static void main(String[] args) {
		String s="Virat Kohli";
		System.out.println("Original String:"+s);
		System.out.println("Length:"+s.length());
		System.out.println(s.substring(6));
		System.out.println(s.substring(0,6));
		String text=new String("Hello, My name is Khan");
		String sentences[]=text.split("\\s");
		System.out.println(Arrays.toString(sentences));
		
		String s1 = "Welcome to split world";
		System.out.println("returning words:");
		String[] words = s1.split("\\s", 0);
		for (String word : words) {
		    System.out.println(word);
		}
		String arr2[]=s1.split("\\s",2);
		for(String w:arr2) {
			System.out.println(w);
		}
		
	}
}
