package p08.lecture.ex3;

public class Malamute implements Pet, SledDog { //다중 인터페이스 구현

	@Override
	public void pull() { //추상 메소드 오버라이딩
		System.out.println("썰매를 끕니다.");
	}

	@Override
	public void sit() { //추상 메소드 오버라이딩
		System.out.println("앉습니다.");
	}
	
}
