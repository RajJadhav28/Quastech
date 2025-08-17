package Arrays22;

import java.util.Scanner;

public class Pro3 {
	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int t,flag=0;
		System.out.println("Enter the element to be find:");
		t=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(t==arr[i]) {
				flag=1;
				System.out.println("Element poisition:"+i);
				System.out.println("Actual position:"+(i+1));
				break;
			}
		}
		if(flag==0) {
			System.out.println("Element not in the array list!!!");
		}
		}catch(Exception e) {
			System.out.println("Enter the valid element!!!");
		}
	}
}
