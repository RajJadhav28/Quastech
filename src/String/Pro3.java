package String;

import java.util.Arrays;

public class Pro3 {
	public static void main(String[] args) {
		String s1="Javatpoint";
		System.out.println("Returning words:");
		String arr[]=s1.split("t",0);
		//method 1
		for(String w:arr) {
			System.out.println(w);
		}
		//method 2
		System.out.println("Using Arrays Stream Method:");
		Arrays.stream(s1.split("\\s",1)).forEach(a->{
			System.out.println(a);
		});
		Arrays.stream(s1.split("t",0)).forEach(a->{
			System.out.println(a);
		});
	}

}
