package io.github.alsguo.io;

import java.io.*;

public class TestReader {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(
					"src/main/java/io/github/alsguo/io/TestReader.java"));
			String str = "";
			StringBuffer buffer = new StringBuffer();
			while ((str = reader.readLine()) != null) {
				buffer.append(str).append("\n");
			}
			System.out.println(buffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}