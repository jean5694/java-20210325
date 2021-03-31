package p04.lecture;

import java.util.Scanner;

public class A13ForGCD {
	public static void main(String[] args) {
		// 최대공약수 : greatest common divisor
		// ex : 12, 18 ==> 6
		// ex : 5, 10 ==> 5

		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요>");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
//		int GCD = 0;

		System.out.println("입력 받은 두 수는 " + num1 + "과 " + num2);

		// 최대 공약수를 출력하는 코드 작성....
	
		for (int d = num1; d>=1; d--) {
			if((num1 % d) == 0 && (num2 % d) ==0) {
				System.out.println("최대공약수는:" + d);
				break;
			}
		}
		
		System.out.println("프로그램 종료합니다.");
		scanner.close();
		
		
		/*
		 int min = num1 > num2 ? num2 : num1;
		

		for (int i = min; i >= 1; i--) {
			if ((num1 % i == 0) && (num2 % i == 0)) {
				GCD = i;
				scanner.close();
				break;
			}
		}
		System.out.println("최대 공약수 : " + GCD);
		 */
	}
}
