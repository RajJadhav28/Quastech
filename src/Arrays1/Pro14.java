package Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class Pro14 {
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
		return arr[1];
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
		for(int i=0;i<arr.length;i++) {
			Arrays.sort(arr);
			System.out.print(arr[i]+" ");
		}
		
		int result=secondSmallest(arr, n);
		System.out.println("\nSecond smallest:"+result);
	sc.close();
	}
}
