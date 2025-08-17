package String;

public class Pro4 {
	public static void main(String[] args) {
		String s1="Yuvraj";//Stored in constant pool
		String s2=new String("Yuvraj");//Stored in heap memory
		String s3="Yuvraj";
		String s4="YUVRAJ";
		String s5="Ratan";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s2);
		String s6=new String("Yuvraj");
		System.out.println(s6);
		System.out.println(s1.equals(s2));//does not compares constant pool and heap memory
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));//String is case sensitive
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		String s7=String.join("-", s1,s2);
		System.out.println(s7);
		String s8=String.valueOf(s1);
		System.out.println(s8);
		
		char ch[]=new char[5];
		s1.getChars(0, 5, ch, 0);
		for(char c:ch) {
			System.out.println(c);
		}
		s2=s2.intern();
		System.out.println(s2);//will place s2 in constant pool
		int wordcount=s1.length();
		System.out.println("No of chars:"+wordcount);
	}
}
