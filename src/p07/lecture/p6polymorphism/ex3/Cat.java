package p07.lecture.p6polymorphism.ex3;

public class Cat extends KindaCat {
	@Override
	public void cry() {
		System.out.println("야옹~~~~~~");
		//추상메소드를 구체적으로 오버라이딩한 코드
	}
}
