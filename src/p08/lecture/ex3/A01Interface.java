package p08.lecture.ex3;

public class A01Interface {
	public static void main(String[] args) {
		Malamute d1 = new Malamute();
		Pet p1 = d1;
		p1.sit();
//		p1.pull(); // x pull 은 SledDog 추상메소드
		
		SledDog s1 = d1;
//		s1.sit(); // x sit 은 Pet 추상메소드
		s1.pull();
	}
}
