package String;

public class Pro1 {
	public static void main(String[] args) {
		String s1="java";
		char ch[]= {'s','t','r','i','n','g'};
		String s2=new String(ch);
		String s3=new String("example");
		String s4=new String(s3);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		String s=s1.concat(s4);
		System.out.println(s);
		String s5=s1.concat(" world");
		System.out.println(s5);
	}
}
