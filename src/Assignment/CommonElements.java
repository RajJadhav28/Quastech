package Assignment;

import java.util.Scanner;

public class CommonElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of 1st array:");
		int s1=sc.nextInt();
		System.out.println("Enter the size of second array:");
		int s2=sc.nextInt();
		int arr1[]=new int[s1];
		int arr2[]=new int[s2];
		
		System.out.println("Enter the elements of first array:");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the elements of second array:");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
		int k=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					k++;
					System.out.println("Common elements:"+arr1[i]);
				}
			}
		}
		System.out.println("No.of common elements:"+k);
		sc.close();
	}
}
