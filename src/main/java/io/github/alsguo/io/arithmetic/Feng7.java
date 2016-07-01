package io.github.alsguo.io.arithmetic;

public class Feng7 {

	/**
	 * A number about 7
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		int n = 150;
		for (int i = 1; i <= n; i++) {
			int res = get(i);
			if (res != 0) {
				buffer.append(i).append(" ");
			}
		}
		System.out.println(buffer.toString());
	}

	/**
	 * 判断条件：(个位不等于0 && 个位除7等于0) || 十位等于7 
	 * 大于100的：递归取十个位
	 * 
	 * @param n
	 * @return
	 */
	private static int get(int n) {
		if (n % 7 == 0)
			return n;
		int t = n / 10;
		int i = n - t * 10;
		if (t > 10)
			return get(n / 10);
		if ((i != 0 && i % 7 == 0) || t == 7)
			return n;//
		return 0;
	}
}
