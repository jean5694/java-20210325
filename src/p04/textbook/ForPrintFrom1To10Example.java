package p04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("---------------------");
		System.out.println("<홀수1>");
		for (int i=1; i<6; i++)
			System.out.println((i*2)-1);
		
		System.out.println("---------------------");
		System.out.println("<홀수2>");
		for (int i=1; i<10; i+=2)
			System.out.println(i);
		
		System.out.println("---------------------");
		System.out.println("<짝수>");
		for (int i=2; i<=10; i+=2)
			System.out.println(i);
		
		System.out.println("---------------------");
		System.out.println("<10~1 반대>");
		for (int i=10; i>=1; i--)
			System.out.println(i);
		
		System.out.println("---------------------");
		System.out.println("<10~1 짝수>");
		for (int i=10; i>=1; i-=2)
			System.out.println(i);
		
		System.out.println("---------------------");
		System.out.println("<10~1 홀수>");
		for (int i=9; i>=1; i-=2)
			System.out.println(i);
		
	}
}
