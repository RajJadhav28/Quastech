package ExceptionHandling;


class MyException extends Exception{
	private int ex;
	MyException(int a){
		ex=a;
	}
	public String toString() {
		return "MyException[ex="+ex+"] is less than zero";
	}
}
public class Pro13 {
	public static void sum(int a, int b) throws MyException  {
		if(a<0) {
			throw new MyException(a);
		}else {
			System.out.println("c:"+(a+b));
		}
	}
	public static void main(String[] args) {
		try {
			sum(-10,10);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
