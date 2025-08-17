package Arrays;
import java.util.Scanner;

public class Pro1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int s=sc.nextInt();
		int sum=0;
		int arr[]=new int[s];
		System.out.println("Enter the array elements:");
		for(int i=0;i<s;i++) {
		 arr[i]=sc.nextInt();
		}
		for(int i=0;i<s;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
