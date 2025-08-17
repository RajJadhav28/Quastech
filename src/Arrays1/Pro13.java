package Arrays1;

import java.util.Scanner;

public class Pro13 {
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
		return arr[0];
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
		int result=secondSmallest(arr, total);
		System.out.println(result);
		sc.close();
		}

}
