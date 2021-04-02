package p05.textbook.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max= Integer.MIN_VALUE; // 인티저 값을 활용하는게 중요
		int[] array = { 1, 5, 3, 8, 2};
		
		for (int i = 0; i<array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println("max : " + max);
		System.out.println("-------------------------");
		
		int min = Integer.MAX_VALUE;  // 인티저 값을 활용하는게 중요
		for (int i = 0; i<array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		System.out.println("min : " + min);
		System.out.println("-------------------------");
		
		
		int sum = 0;
		for (int i = 0; i<array.length; i++) {
			sum += array[i];
		}
		System.out.println("sum : " + sum);
		System.out.println("-------------------------");
		
		
		double avg = (double)sum/array.length;
		System.out.println("avg : " + avg);
	}
}
