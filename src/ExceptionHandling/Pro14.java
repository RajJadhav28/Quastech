package ExceptionHandling;

import java.io.IOException;

public class Pro14 {
	void m() throws IOException{
		throw new IOException("device error");
	}
	void n() throws IOException{
		m();
	}
	void p() {
		try {
			n();
		}catch(Exception e) {
			System.out.println("exception handled.");
		}
	}
	public static void main(String[] args) {
		Pro14 obj=new Pro14();
		obj.p();
		
	}
}
