package p03.textbook.exercise;

public class Ch03Exercise06 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom)*height/2.0;
		System.out.println(area);
		
		double area1 = (double) (lengthTop + lengthBottom)*height/2;
		System.out.println(area1);
		
		double area2 = (lengthTop + lengthBottom)*height/2d;
		System.out.println(area2);
	}
}
