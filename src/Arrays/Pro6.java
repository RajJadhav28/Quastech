package Arrays;

public class Pro6 {
	public static void main(String args[]) {
		int arr[][]= new int[3][3];
		int value=1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=value;
				value++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
