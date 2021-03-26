package p02.lecture;

public class A13TypeConversion {
	public static void main(String[] args) {
		// int : 4byte (32bit)
		// float : 4byte (32bit)
		
		// float 저장법
		// 부호비트 1
		// 지수비트 8  
		// 가수비트 23 (지수의 x승)
		// 0000 0000 0000 0000 0000 0000 0000 0000
		// 부호(1) 지수(8) 가수(23) 순서 // 총 32bit로 구성됨
		
		int intVar1 = 66977791;
		float floatVar1 = intVar1;
		
		System.out.println(floatVar1);
		
		//double 저장법 (8byte)
		// 부호비트1
		// 지수비트11
		// 가수비트52
		
		double doubleVar1 = intVar1;
		System.out.println(doubleVar1);
		
	}
}
