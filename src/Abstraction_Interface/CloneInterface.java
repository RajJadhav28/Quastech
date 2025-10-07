package Abstraction_Interface;

class Animal1 implements Cloneable{
	String type1;
	public Animal1(String type1) {
		this.type1=type1;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Animal [type1=" + type1 + "]";
	}
	
//	protected Object clone() throws CloneNotSupportedException{
//		return super.clone();
//	}
	
}
public class CloneInterface {
	public static void main(String[] args) {
		Animal1 tiger=new Animal1("wild");
		System.out.println(tiger);
		try {
			Animal1 lion=(Animal1)tiger.clone();
			System.out.println(lion);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
