package io.github.alsguo.io.arithmetic;

public class NumverDigit {

	/**
	 * 取数字的每个位上的数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String digits[] = { "个", "十", "百", "千", "万", "十万", "百万", "千万", "亿" };
		int num = 123456;
		int n = 0, e = 10;
		int tempNum = num;

		while (tempNum / 10 > 0) {
			n++;
			tempNum = tempNum / 10;
		}

		StringBuffer buffer = new StringBuffer(num + "的");
		for (int i = 0; i <= n; i++) {
			buffer.append(digits[i]).append("位数是  ")
				// .append((int) (num / Math.pow(10, i) % 10))
					.append(num / pow(e, i) % 10)
					.append(" ");
		}
		System.out.println(buffer.toString());
	}

	private static int pow(int num, int n) {
		int res = 1;
		for (int i = 0; i < n; i++) {
			res = res * num;
		}
		return res;
	}
}
