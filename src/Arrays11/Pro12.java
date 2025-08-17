package Arrays11;

import java.util.Scanner;

public class Pro12 {
	public static int secondLargest(int arr[], int total) {
		int largest=Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				second_largest=largest;
				largest=arr[i];
			}else if(arr[i]>second_largest && arr[i]!=largest) {
				second_largest=arr[i];
			}
		}
		return second_largest;
	}
	public static int secondSmallest(int arr[], int total) {
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondSmallest=smallest;
				smallest=arr[i];
			}else if(arr[i]<secondSmallest && arr[i]!=smallest) {
				secondSmallest=arr[i];
			}
		}
		return secondSmallest;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int result=secondLargest(arr, n);
		System.out.println("Second largest:"+result);
		int result1=secondSmallest(arr, n);
		System.out.println("Second Smallest:"+result1);
		sc.close();
	}
}
