package io.github.alsguo.io.local;

import java.util.Locale;
import java.text.NumberFormat;

public class TestNumber01 {
	public static void main(String[] args) {
		double dbl = 123456.789;
		// No.1
		// 开始写代码。需求：将以上的数字在中、日、德三国地点设定下显示输出
		Locale cnLocale = new Locale("zh", "CN");
		Locale jpLocale = new Locale("ja", "JP");
		Locale deLocale = new Locale("de", "DE");

		NumberFormat cnFormat = NumberFormat.getCurrencyInstance(cnLocale);
		NumberFormat jpFormat = NumberFormat.getCurrencyInstance(jpLocale);
		NumberFormat deFormat = NumberFormat.getCurrencyInstance(deLocale);

		System.out.println("China Number Format:" + cnFormat.format(dbl));
		System.out.println("Japan Number Format:" + jpFormat.format(dbl));
		System.out.println("German Number Format:" + deFormat.format(dbl));
		// end_code
	}
}