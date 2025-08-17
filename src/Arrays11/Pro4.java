package Arrays11;

import java.util.Scanner;

public class Pro4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		System.out.println("Enter the number of columns:");
		int m=sc.nextInt();
		
		int arr[][]=new int[n][m];
		int brr[][]=new int[n][m];
		int crr[][]=new int[n][m];
		System.out.println("Enter the elements of first matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of second matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				brr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Addition of matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				crr[i][j]=arr[i][j]+brr[i][j];
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
