package Arrays1;

import java.util.Scanner;

public class Pro15 {
	public static int secondLargest(int arr[], int total) {
		int largest=Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				second_largest=largest;
				largest=arr[i];
			}else if(arr[i]>second_largest&&arr[i]!=largest){
				second_largest=arr[i];
			}
		}
		return second_largest;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int total=sc.nextInt();
		int arr[]=new int[total];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int result=secondLargest(arr, total);
		System.out.println("Second largest:"+result);
		sc.close();
	}

}
