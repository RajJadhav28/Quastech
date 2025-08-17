package Static;

public class Pro2 {
	static int count=0;
	public static void main(String[] args) {
		System.out.println("Initial count:"+count);
		count=5;
		System.out.println("After first changing:"+count);
		count+=3;
		System.out.println("After second change:"+count);
		doubleCount();
		System.out.println("After method call:"+count);	
	}
	public static void doubleCount() {
		count*=2;
	}
}
