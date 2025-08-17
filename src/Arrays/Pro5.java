package Arrays;

public class Pro5 {
	public static void main(String args[]) {
		int a[]= {1,2,3,0};
		int i,j,temp;
		for( i=0;i<4;i++) {
			for(j=i+1;j<4;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k:a) {
			System.out.println(k+" ");
		}
	}

}
