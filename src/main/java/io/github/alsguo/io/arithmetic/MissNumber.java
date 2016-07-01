package io.github.alsguo.io.arithmetic;

public class MissNumber {

	/**
	 * 寻找丢失的数 
	 * 高斯求和 100 * 101 / 2 
	 * @param args
	 */
	public static void main(String[] args) {
		int missNumer = findMissNumber(new int[] { 0, 1, 2 });
		System.out.println(missNumer);
	}

	private static int findMissNumber(int arrs[]) {
		int total = 0;
		for (int i : arrs) {
			if (i == 0)
				continue;
			total += i;
		}
		int rTotal = arrs.length * (arrs.length + 1) / 2;
		return rTotal - total;
	}
}
