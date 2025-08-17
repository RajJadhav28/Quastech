package Arrays1;

import java.util.Scanner;

public class Pro9 {
	public static int[][] multiply(int arr[][],int brr[][], int n, int m, int p) {
		if(arr.length!=n||arr[0].length!=m||brr.length!=n||brr[0].length!=m) {
			throw new IllegalArgumentException("Matrix dimension does not match!!!");
		}
		int crr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				crr[i][j]=0;
				for(int k=0;k<arr[i].length;k++) {
					crr[i][j]+=arr[i][k]*brr[k][j];
				}
			}
		}
		return crr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		System.out.println("Enter the number of colums of first matrix:");
		int m=sc.nextInt();
		System.out.println("Enter the number of columns of second matrix:");
		int p=sc.nextInt();
		int arr[][]=new int[n][m];
		int brr[][]=new int[m][p];
		//int crr[][]=new int[n][p];
		
		System.out.println("Enter the values of 1st matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the values of 2nd matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				brr[i][j]=sc.nextInt();
			}
		}
		int result[][]=multiply(arr, brr, n, m,p);
		for(int i=0;i<n;i++) {
			for(int j=0;j<p;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
