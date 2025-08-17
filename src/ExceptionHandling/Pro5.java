package ExceptionHandling;

public class Pro5 {
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5};
		try {
			//int index=10;
			int value=num[10];
			System.out.println("Value of index:10:"+value);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
