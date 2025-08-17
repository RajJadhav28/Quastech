package Arrays2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pro12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		HashMap<Integer, Integer> frequencymap=new HashMap<Integer, Integer>();
		for(int num:arr) {
			frequencymap.put(num, frequencymap.getOrDefault(num, 0)+1);
		}
		System.out.println("Frequency:");
		for(Map.Entry m:frequencymap.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		sc.close();
	}
}
