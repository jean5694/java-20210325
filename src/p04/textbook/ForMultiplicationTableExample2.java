package p04.textbook;

public class ForMultiplicationTableExample2 {
	public static void main(String[] args) {
		System.out.println("새로운 줄 enter");
		System.out.print("같은 줄 + ");
		System.out.print("같은 줄 - ");
		System.out.println("새로운 줄 enter");
		System.out.println("시작");
		System.out.println("--------------------");
		System.out.println("<삼각형 왼쪽>");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

		System.out.println("--------------------");
		System.out.println("<역삼각형 왼쪽1>");

		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

		System.out.println("--------------------");
		System.out.println("<역삼각형 왼쪽2>");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5 - i); j++) {
				System.out.print("★");
			}
			System.out.println();
		}

		System.out.println("--------------------");
		System.out.println("<역삼각형 오른쪽>");

		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (5 - i); j++) {
				System.out.print("★");
			}
			System.out.println();
		}

		System.out.println("--------------------");
		System.out.println("<삼각형 오른쪽>");

		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < (4-i); k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
}