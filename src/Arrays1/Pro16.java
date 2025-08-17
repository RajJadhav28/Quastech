package Arrays1;

import java.util.Scanner;

public class Pro16 {
	public static int secondSmallest(int arr[], int total) {
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondSmallest=smallest;
				smallest=arr[i];
			}else if(arr[i]<secondSmallest && arr[i]!=smallest){
				secondSmallest=arr[i];
			}
		}
		//return secondSmallest;
		return smallest;
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
		int result=secondSmallest(arr, n);
		//System.out.println("Second smallest:"+result);
		System.out.println("Smallest:"+result);
		sc.close();
	}
}
