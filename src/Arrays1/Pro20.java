package Arrays1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pro20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		Map<Integer, Integer> frequencyMap=new HashMap<Integer, Integer>();
		for(int num:arr) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
		}
		
		//Print the freuency of each element
		System.out.println("Frequency of element:");
		for(Map.Entry entry:frequencyMap.entrySet()) {
			System.out.println("Element "+entry.getKey()+" occurs "+entry.getValue()+" times");
			
		}
		sc.close();
	}

}
