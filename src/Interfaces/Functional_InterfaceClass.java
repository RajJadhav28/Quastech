package Interfaces;

import java.util.Scanner;

interface Writable{
	void write(String txt);
}
public class Functional_InterfaceClass implements Writable{
	public void write(String txt) {
		System.out.println(txt);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Functional_InterfaceClass obj=new Functional_InterfaceClass();
		 System.out.println("Enter the text:");
		 String txt=sc.nextLine();
		 obj.write(txt);
	}
}
