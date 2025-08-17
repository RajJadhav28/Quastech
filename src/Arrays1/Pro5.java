package Arrays1;

import java.util.Scanner;

public class Pro5 {
	public static void indexpos(int t,int arr[]) {
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			if(t==arr[i]) {
				flag=1;
				System.out.println("Index position:"+i);
				System.out.println("Position:"+(i+1));
				break;
			}
		}
		if(flag==0) {
			System.out.println("Element not found!!!");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched:");
		int t=sc.nextInt();
		indexpos(t, arr);
		sc.close();
	}

}
