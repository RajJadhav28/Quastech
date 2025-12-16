package String2;

public class Pro6 {
	public static void main(String[] args) {
		String s1="Yuvraj";//Stored in constant pool
		String s2=new String("Yuvraj");//stored in heap memory
		String s3="Yuvraj";
		String s4="YUVRAJ";
		String s5="Ratan";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1==s5);
		
		System.out.println("===================");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println("====================-");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		
		
		String s8=String.valueOf(s1);
		System.out.println(s8);
		char ch[]=s2.toCharArray();
		System.out.println(ch);
		
		char ch1[]=new char[5];
		s1.getChars(0, 5, ch1, 0);
		for(char c:ch1) {
			System.out.print(c+" ");
		}
		s2=s2.intern();
		System.out.println("\n"+s2);
		int charCount=s1.length();
		System.out.println("no.of chars:"+charCount);
	}
}
