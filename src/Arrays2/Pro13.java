package Arrays2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pro13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		
		String arr[]=new String[n];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		HashMap<String, Integer> frequencymap=new  HashMap<String, Integer>();
		for(String s:arr) {
			frequencymap.put(s, frequencymap.getOrDefault(s, 0)+1);
		}
		System.out.println("Frequency:");
		for(Map.Entry m:frequencymap.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
	}
}
