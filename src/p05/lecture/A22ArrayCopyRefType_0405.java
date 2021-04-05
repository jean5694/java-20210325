package p05.lecture;

import java.util.Arrays;

public class A22ArrayCopyRefType_0405 {
	// 그림: 08.참조타입배열 복사.png
	public static void main(String[] args) {
		String[] s = {"java", "abc"};
		String[] t = new String[2];
		
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(t));
		
		System.arraycopy(s, 0, t, 0, 2);
		
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(t));
	}
}
