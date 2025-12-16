package ArrayList1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pro3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			numbers.add(sc.nextInt());
		}
		System.out.println("\nOriginal list:"+numbers);
		Collections.sort(numbers);
		System.out.println("Ascending order:"+numbers);
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println("Descending order:"+numbers);
		sc.close();
	}
}
