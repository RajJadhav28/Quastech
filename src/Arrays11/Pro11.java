package Arrays11;

import java.util.Scanner;

public class Pro11 {
	public static int secondSmallest(int arr[], int total) {
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//return arr[0];//smallest
		return arr[1];//secondSmallest
		//return arr[total-1]//largest
		//returnarr[total-2]//secondLargest
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int result=secondSmallest(arr, n);
		System.out.println("\nSecond smallest:"+result);
	sc.close();
	}
}
