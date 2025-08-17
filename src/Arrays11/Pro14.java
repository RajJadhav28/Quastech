package Arrays11;

import java.util.Arrays;
import java.util.Scanner;

public class Pro14 {
	public static int[] merge(int arr1[],int arr2[]) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int n1=arr1.length;
		int n2=arr2.length;
		
		int mergeArray[]=new int[n1+n2];
		
		int i=0, j=0,k=0;
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				mergeArray[k++]=arr1[i++];
			}else {
				mergeArray[k++]=arr2[j++];
			}
		}
		while(i<n1) {
			mergeArray[k++]=arr1[i++];
		}
		while(j<n2) {
			mergeArray[k++]=arr2[j++];
		}
		return mergeArray;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of 1st array:");
		int n=sc.nextInt();
		System.out.println("Enter the size of 1st array:");
		int m=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[m];
		System.out.println("Enter the elements of first array:");
		for(int i=0;i<arr1.length;i++) 
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of second array:");
		for(int j=0;j<arr2.length;j++) 
		{
			arr2[j]=sc.nextInt();
		}
		
		int mergedArray[]=merge(arr1, arr2);
		System.out.println("Merged sorted array:");
		for(int num:mergedArray) {
			System.out.print(num+" ");
			sc.close();
		}
	}
}
