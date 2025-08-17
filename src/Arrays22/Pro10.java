package Arrays22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pro10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		HashMap<String, Integer>frequency=new HashMap<String, Integer>();
		for(String num:arr) {
			frequency.put(num, frequency.getOrDefault(num, 0)+1);
		}
		for(Map.Entry<String, Integer>entry:frequency.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
