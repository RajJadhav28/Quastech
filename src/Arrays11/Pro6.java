package Arrays11;

import java.util.Scanner;

public class Pro6 {
	public static int removeduplicate(int arr[]) {
		if(arr.length==0) {
			return 0;
		}
		int j=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i+1];
				j++;
			}
		}
		return j;
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
		System.out.println("After removing duplicate elements:");
		int result=removeduplicate(arr);
		for(int i=0;i<result;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sc.close();
	}
}
