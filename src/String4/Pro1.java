package String4;

import java.util.Arrays;
import java.util.StringJoiner;

public class Pro1 {
	public static void main(String[] args) {
		String s1="Java";
		String words[]= {"Hello","Java","World"};
		String joinedString=String.join(" ", words);
		System.out.println(joinedString);
		StringJoiner s6=new StringJoiner(" ");
		s6.add("Welcome");
		s6.add("World");
		System.out.println(s6);
		
		String s2="JavaTpoint";
		System.out.println("Returning words:");
		String arr[]=s2.split("T",0);
		//method 1
		for(String w:arr) {
			System.out.println(w);
		}
		//method 2
		System.out.println("Using Arrays Stream Method:");
		Arrays.stream(s2.split("\\s",1)).forEach(a->{
			System.out.println(a);
		});
		Arrays.stream(s2.split("T",0)).forEach(a->{
			System.out.println(a);
		});
	}
}
