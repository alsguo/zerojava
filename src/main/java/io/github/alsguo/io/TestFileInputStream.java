package io.github.alsguo.io;

import java.io.File;
import java.io.FileInputStream;

public class TestFileInputStream {

	public static void main(String[] args) {
		try {
			File f = new File("test.txt");
			FileInputStream fis = new FileInputStream(f);
			byte b [] = new byte[(int) f.length()];
			fis.read(b);
			System.out.println(new String(b));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
