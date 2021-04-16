package p09.lecture;

public class A01NestedClassExample {
	public static void main(String[] args) {
		A01NestedClass.StaticClass o1 = new A01NestedClass.StaticClass(); //스태틱은 가능
//		A01NestedClass.InnerClass o2 = new A01NestedClass.InnerClass(); // 인스턴스는 불가능
		
		A01NestedClass outer1 = new A01NestedClass(); //인스턴스는 객체형성을 먼저 해줘야 함.
		A01NestedClass.InnerClass o3 = outer1.new InnerClass();
	}
}
