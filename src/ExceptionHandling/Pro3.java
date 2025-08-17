package ExceptionHandling;

public class Pro3 {
	public static void main(String[] args) {
		String str=null;
		try {
			int length=str.length();
			System.out.println("String Length:"+length);
		}catch(NullPointerException e) {
			System.out.println("NullPonterException");
		}
	}
}
