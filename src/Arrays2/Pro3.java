package Arrays2;

import java.util.Scanner;

public class Pro3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the size of array:");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the array elements:");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int t; boolean flag=false;
			System.out.println("Enter the element to be find:");
			t=sc.nextInt();
			for(int i=0;i<n;i++) {
				if(t==arr[i]) {
					flag=true;
					System.out.println("Index position:"+i);
					System.out.println("Actual position:"+(i+1));
					break;
				}
			}
			if(flag==false) {
				System.out.println("Element not found");
			}
		}catch(Exception e) {
			System.out.println("Enter valid element!!!");
			
		}
		sc.close();
	}
}
