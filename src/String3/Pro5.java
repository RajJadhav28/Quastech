package String3;

import java.util.Arrays;
import java.util.StringJoiner;

public class Pro5 {
	public static void main(String[] args) {
		String words[]= {"Hello","Java","World"};
		String StringJoiner=String.join("", words);
		System.out.println(StringJoiner);
		
		String s1="JavaTpoint";
		System.out.println("Returning words:");
		String arr[]=s1.split("T",0);
		for(String w:arr) {
			System.out.println(w);
		}
		String arr2[]=s1.split("\\s",2);
		for(String m:arr2) {
			System.out.println(m);
		}
		String s2="Welcome to split world";
		Arrays.stream(s2.split("\\s",2)).forEach(a->{
			System.out.println(a);
		});
	}
}
