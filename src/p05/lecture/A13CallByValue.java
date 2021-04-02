package p05.lecture;

public class A13CallByValue {
	public static void main(String[] args) {
		System.out.println("main statement1");
	
		method1();
		
		method1();
		
		System.out.println("main statement2");
		
		method1();
		
		method2(5); //소괄호 안에 int 값을 꼭 넣어줘야 함
		
		method2(20);
		
	}
	
	public static void method1() {
		System.out.println("method1 statement1");
		System.out.println("method1 statement2");
	}
	
	public static void method2(int i) {
		System.out.println("method2 statement1");
		System.out.println(i);
		System.out.println("method2 statement2");
	}
}
