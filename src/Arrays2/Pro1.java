package Arrays2;

import java.util.Scanner;

public class Pro1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of rows:");
		int n=sc.nextInt();
		System.out.println("Enter the no.of columns:");
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entered Matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
