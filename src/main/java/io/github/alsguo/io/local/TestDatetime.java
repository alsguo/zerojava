package io.github.alsguo.io.local;
import java.util.Locale;
import java.awt.datatransfer.DataFlavor;
import java.text.DateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class TestDatetime{
	public static void main(String[] args){
		//No.1
		//开始写代码。需求：以中、日、德三国的格式输出当前日期和时间
		Date date = new Date();
		DateFormat cnFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT,DateFormat.DEFAULT, new Locale("zh","CN"));
		DateFormat jpFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT,DateFormat.DEFAULT,new Locale("ja","JP"));
		DateFormat deFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT,DateFormat.DEFAULT,new Locale("de","DE"));
		System.out.println(cnFormat.format(date));
		System.out.println(jpFormat.format(date));
		System.out.println(deFormat.format(date));
		//end_code		
	}
}