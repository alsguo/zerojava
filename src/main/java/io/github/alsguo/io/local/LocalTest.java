package io.github.alsguo.io.local;
import java.util.Locale;
public class LocalTest {
	public static void main(String args[]){
		//No.1
		//开始写代码。需求：获得本程序运行机器上的Locale信息，并且将其语言、国家/地区代码，语言名称以全称打印输出
		Locale lcl = Locale.getDefault();
		System.out.println("语言代码 ： " + lcl.getLanguage());
		System.out.println("国家地区代码 ："+lcl.getCountry());
		System.out.println("语言名称 ： "+lcl.getDisplayLanguage());
		System.out.println("地区全称 ：" + lcl.getDisplayCountry());
		//end_code
		System.out.println("返回对此locale的描述:"+lcl.toString());
	}
}