package Expenzing;

import java.util.ArrayList;

public class Pro5 {
	public static void main(String[] args) {
		ArrayList<String> li=new ArrayList<String>();
		li.add("Raj");
		li.add("Pooja");
		li.add("Jidnesh");
		li.add("Sammer");
		li.add("Namu");
		li.forEach(a->{
			System.out.println(a);
		});
		System.out.println("=======================");
		for(String s:li){
			System.out.println(s);
		}
	}
}
