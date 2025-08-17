package Arrays;
import java.util.*;
public class Pro11 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows of array:");
		int row=sc.nextInt();
		
		int arr[][]=new int[row][];
		
		System.out.print("Enter the number of elements of row:");
		for(int i=0;i<row;i++) {
			int col=sc.nextInt();
			arr[i]=new int[col];
			System.out.print("Enter the elemennts of the row:");
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Jagged array is:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
