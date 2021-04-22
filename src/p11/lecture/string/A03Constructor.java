package p11.lecture.string;

public class A03Constructor {
	public static void main(String[] args) {
		String str1 = "java";
		
		String str2 = new String("java");
		
		String str3 = new String(new char[] {'j', 'a', 'v', 'a'});
		//string 타입은 char 배열도 매개변수로 사용 가능
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		String str4 = new String(new byte[] {106, 97, 118, 97});
		//string 타입은 바이트 코드→ 아스키코드 변환해서 입력 가능 
		System.out.println(str4);
	}
}




