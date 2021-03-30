package p04.lecture;

import java.util.Scanner;

public class A07IfSampleWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dice = (int) (Math.random() * 6) + 1;

		while (true) {
			System.out.println("주사위의 수를 맞춰보세요>");
			int user = scanner.nextInt();

			if (user == dice) {
				System.out.println("맞췄습니다.");
				break;
			} else {
				System.out.println("주사위의 수는 " + dice + "입니다.");
			}
		}
	}
}
