package Arrays;

import java.util.Scanner;

public class Pro3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int s=sc.nextInt();
		int sum=0;
		int arr[]=new int[s];
		System.out.println("Enter the array elements:");
		
		for(int i=0;i<s;i++) {
		 arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<s;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("minimum value of array:"+max);
	}

}
