package p04.textbook.Exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔액 | 4. 종료");
			System.out.println("-------------------------");
			System.out.println("선택>");
			int text = scanner.nextInt();

			switch (text) {
			case 1:

				System.out.println("예금액>");
				int x = scanner.nextInt();
				balance += x;
				break;

			case 2:
				System.out.println("출금액>");
				int y = scanner.nextInt();
				balance -= y;
				break;

			case 3:
				System.out.println("잔액" + balance);
				break;

			default:
				run = false;
				break;
			}
		}

		scanner.close();
		System.out.println("프로그램 종료");

	}
}
