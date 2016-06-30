package io.github.alsguo.io.math;

public class MathTest {

	public static void main(String[] args) {

		System.out.println(123/100%10);
		System.out.println(Math.pow(10, 0));
		
		int n = 5,s=1;
		for (int i = 0; i < n; i++) {
			s = s * 10;
		}
		System.out.println(s);
	}
}
