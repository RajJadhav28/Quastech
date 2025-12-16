package String2;

public class Pro1 {
	public static void main(String[] args) {
		String s1="Java";
		char ch[]= {'s','t','r','i','n','g'};
		String s2=new String(ch);
		System.out.println(s2);
		String s3=new String("example");
		System.out.println(s3);
		String s=s1.concat(s3);
		System.out.println(s);
		String s5=s1.concat(" world");
		System.out.println(s5);
	}
}
