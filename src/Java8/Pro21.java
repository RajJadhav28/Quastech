package Java8;

interface a31{
	public void mult(int n,int a);
}
public class Pro21 {

	public static void main(String[] args) {
		int num=5;
		a31 obj=(n,a)->{ System.out.println(n*a);};
		for(int i=0;i<10;i++) {
			obj.mult(num, i);
		}
	}
}
