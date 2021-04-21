package p07.lecture.p6polymorphism.ex3;

public class A02AbstractMethod {
	public static void main(String[] args) {
		KindaCat k1 = new Cat();
		KindaCat k2 = new Tiger();
		
		k1.cry(); //야옹
		k2.cry(); //어흥
		//실체클래스에서 오버라이딩된 메소드가 호출됨
	}
}
