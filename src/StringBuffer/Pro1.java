package StringBuffer;

public class Pro1 {
	public static void main(String[] args) {		
		StringBuffer sb=new StringBuffer("Hello");
		sb.append(" Java");
		System.out.println(sb);
		sb.insert(1, "php");
		System.out.println(sb);
		
		StringBuffer sb2=new StringBuffer("Hello");
		sb2.replace(1, 3, "DotNet");
		System.out.println(sb2);
		sb2.delete(1, 3);
		System.out.println(sb2);
		
		StringBuffer sb3=new StringBuffer("Hello");
		sb3.reverse();
		System.out.println(sb3);
		System.out.println("capacity:"+sb3.capacity());
		sb3.append("World");
		System.out.println(sb3);
		
		StringBuffer sb4=new StringBuffer();
		sb4.append("Hello");
		sb4.append(" java is my coding language");
		System.out.println(sb4);
		sb4.capacity();
		System.out.println(sb4.capacity());
		sb4.ensureCapacity(40);
		System.out.println(sb4.capacity());
		
	}
}
