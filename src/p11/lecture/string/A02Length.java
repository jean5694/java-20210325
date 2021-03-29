package p11.lecture.string;

public class A02Length {
	public static void main(String[] args) {
		String str1 = "java servelet spring ";
		int len = str1.length(); //문자 글자수 (스페이스 바 포함)
		System.out.println(len);
		
		String s1 = str1.substring(18,19);
		System.out.println(s1);
		
		String s2 = str1.substring(len-1, len);
		System.out.println(s2);
	}
}
