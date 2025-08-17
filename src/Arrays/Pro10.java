package Arrays;
import java.util.*;

public class Pro10 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int row=sc.nextInt();
		int arr[][]=new int[row][];
		System.out.println("Enter the number of elements of rows:");
		int col=sc.nextInt();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<arr[i].length;j++) {
			arr[i]=new int[] {col};
		}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
