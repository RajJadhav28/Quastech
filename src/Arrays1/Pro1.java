package Arrays1;

public class Pro1 {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=70;
		a[3]=40;
		a[4]=50;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("==========");
		int b[]= {33,4,5,6};
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println("===========");
		for(int i:b) {
			System.out.println(i);
		}
	}
}
