package Arrays1;

import java.util.Scanner;

public class Pro2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row:");
		int n=sc.nextInt();
		System.out.println("Enter the size of column:");
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		System.out.println("Enter the value:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
