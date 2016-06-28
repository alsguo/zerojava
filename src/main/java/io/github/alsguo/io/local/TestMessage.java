package io.github.alsguo.io.local;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;

public class TestMessage{
	public static void main(String[] args){
		//No.1
		//开始写代码。需求：以“kk，今天是xxxx年yy月zz日”的格式输出数据，其中kk、xxxx、yy和zz均不确定，需要根据参数而变化
		String pattern = "{0}，今天是{1}";
		MessageFormat mf = new MessageFormat(pattern);
		Locale lcl = Locale.getDefault();
		
		mf.setLocale(lcl);
		Date now = new Date();
		Object[] params = {"zhangsan",now};
		
		System.out.println(mf.format(params));
		
		//end_code
	}
}