package p07.lecture.p2constructor;

public class Child extends Parent{
	private int j;
	
//	public Child() {
//		super(3); // 상위 클래스의 생성자를 호출해야 함.
//	}
	
	public Child(int i, int j) {
		super(i);
		this.j = j;
	}
}
