package Assignment;

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of rows:");
		int n=sc.nextInt();
		System.out.println("Enter the size of columns:");
		int m=sc.nextInt();
		int arr[][]=new int [n][m];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix elements:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print("Array element "+i+""+j+":"+arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Original Array");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix elements:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print("Array element "+j+""+i+":"+arr[j][i]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
