package Arrays1;

import java.util.Scanner;

public class Pro8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		System.out.println("Enter the number of columns of first matrix:");
		int m=sc.nextInt();
		System.out.println("Enter the number of columns of second matrix:");
		int p=sc.nextInt();
		int arr[][]=new int[n][m];
		int brr[][]=new int[m][p];
		int crr[][]=new int[n][p];
		System.out.println("Enter the value of first matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the value of second matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				brr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Multiplication of matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				crr[i][j]=0;
				for(int k=0;k<arr[i].length;k++) {
					crr[i][j]=crr[i][j]+arr[i][k]*brr[k][j];
				}
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
