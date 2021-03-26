package p02.lecture;

public class A07TypeChar {
	public static void main(String[] args) {
		//cahr : 2byte (8bit) 문자저장
		// javascript
		//var a = "a";
		//	  a = "가";
		
		// java 문자열
		String s1 = "hello"; //2자 이상 문자열을 쓸 때
		s1 = "자바"; // 큰 따옴표 string literal
		s1 = "자";
		s1 = "a";
		s1 ="";
		
		// java 문자
		char charVar;
//		charVar = "a"; // not ok 
		charVar = 'a'; // 작은 따옴표 char literal
		charVar = '눈';
		System.out.println(charVar);
		charVar = '\uB208';
		System.out.println(charVar);
		charVar = 45576;
		System.out.println(charVar);
		
//		charVar = ''; //not ok
		charVar = '\u10E6';
		System.out.println(charVar);
		charVar = 4326;
		System.out.println(charVar);
	}
}
