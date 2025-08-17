package Arrays22;

import java.util.Scanner;

public class Pro11 {
	public static int secondHighest(int arr[], int total) {
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
		}
		return secondLargest;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int total=sc.nextInt();
		int arr[]=new int[total];
		System.out.println("Enter the array elements:");
		for(int i=0;i<total;i++) {
			arr[i]=sc.nextInt();
		}
		int result=secondHighest(arr, total);
		System.out.println("Second highest element:"+result);
	}
}
