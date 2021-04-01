package p04.Exercise;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dice = (int) (Math.random() * 6) + 1;

		while (true) {
			int user1 = scanner.nextInt();
			int user2 = scanner.nextInt();

			if ((user1 == dice) {
				System.out.println("맞췄습니다.");
				break;
			} else {
				System.out.println("주사위의 수는 " + dice + "입니다.");
			}
		}
	}
	}
	

