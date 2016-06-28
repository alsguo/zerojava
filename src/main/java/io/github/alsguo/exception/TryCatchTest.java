package io.github.alsguo.exception;

import java.io.FileInputStream;

public class TryCatchTest {

	public static void main(String[] args) {
		try {
			/**
			 * jdk1.7 在try对资源释放 将自动调用close方法
			 * 文件操作，数据库连接，流等
			 */
			FileInputStream fis = new FileInputStream("");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
