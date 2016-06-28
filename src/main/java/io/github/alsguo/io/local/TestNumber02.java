package io.github.alsguo.io.local;
import java.util.Locale;
import java.text.NumberFormat;

public class TestNumber02{
	public static void main(String[] args){
		double dbl = 123456.789;
		//No.1
		//开始写代码。需求：将以上的金额在中、日、美三国以及欧盟地点设定下显示输出
		Locale cnLocale = new Locale("zh", "CN");
		Locale jpLocale = new Locale("ja", "JP");
		Locale usLocale = new Locale("en", "US");

		NumberFormat cnFormat = NumberFormat.getCurrencyInstance(cnLocale);
		NumberFormat jpFormat = NumberFormat.getCurrencyInstance(jpLocale);
		NumberFormat usFormat = NumberFormat.getCurrencyInstance(usLocale);

		System.out.println("China Number Format:" + cnFormat.format(dbl));
		System.out.println("Japan Number Format:" + jpFormat.format(dbl));
		System.out.println("US Number Format:" + usFormat.format(dbl));
		//end_code
	}
}