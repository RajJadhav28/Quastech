package Arrays11;

import java.util.Scanner;

public class Pro2 {
	public static void main(String[] args) {
//		char arr[]= {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
//		char arr1[]=new char[7];
//		System.arraycopy(arr,2,arr1,0,7);
//		System.out.println(String.valueOf(arr1));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Printing original array:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nPrinting the clone array:");
		int carr[]=arr.clone();
		for(int i:carr) {
			System.out.print(i+" ");
		}
		
		sc.close();
	}
	}
	
