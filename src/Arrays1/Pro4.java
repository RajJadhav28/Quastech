package Arrays1;

import java.util.Scanner;

public class Pro4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of arrays:");
		int n=sc.nextInt();int flag=0;
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched:");
		int t=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(t==arr[i]) {
				flag=1;
				System.out.println("Index position:"+i);
				break;
			}
		}
		if(flag==0) {
			System.out.println("Element not found!!!");
		}
		sc.close();
	}
}
