package p05.lecture;

public class A06StringEquals {
	// 그림 : 05.StringEquals.png
	public static void main(String[] args) {
		String s = new String("java");
		String t = "java";
		String u = "java";
		
		
		boolean d1 = s.equals(t); // s와 (t)를 비교
		System.out.println(s == t); //false
		System.out.println(d1); //true
		
		System.out.println(s.equals(s)); // true
		System.out.println(t.equals(u)); // true
	}
}
