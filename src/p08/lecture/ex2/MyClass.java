package p08.lecture.ex2;

public class MyClass implements MyInterface {
	@Override
	public void method1() { //추상 메소드 오버라이딩
		System.out.println("method1 ");
	}
	
	@Override
	public void method2() { //추상 메소드 오버라이딩
		System.out.println("method2 ");
	}
}
