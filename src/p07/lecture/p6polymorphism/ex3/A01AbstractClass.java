package p07.lecture.p6polymorphism.ex3;

public class A01AbstractClass {
	public static void main(String[] args) {
		KindaCat k1 = new Cat();
		KindaCat k2 = new Tiger();
		
//		KindaCat k3 = new KindaCat();
		// 추상 클래스는 인스턴스를 만들 수 없음
		// 객체 생성을 할 때에는 무조건 실체클래스를 사용해야 함.
	}
}
