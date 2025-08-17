package ExceptionHandling;

public class Pro16 {
	protected void finalize() throws Throwable{
		System.out.println("finalize method id called before garbage is collected");		
	}
	public static void main(String[] args) {
		Pro16 obj=new Pro16();
		System.gc();
		System.out.println("Main method completed.");
	}
}
