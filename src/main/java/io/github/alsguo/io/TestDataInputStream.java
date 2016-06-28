package io.github.alsguo.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataInputStream {
	public static void main(String[] args) {
		try {
			String pathname = "f:/test.txt";
			File file = new File(pathname);
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(
					file, true));
			Double d = 12.21;
			int i = 12;
			String str = "hi";
			Boolean b = true;

			//写入各种数据类型
			dos.writeDouble(d);
			dos.writeInt(i);
			dos.writeBoolean(b);
			dos.writeBytes(str);

			DataInputStream dis = new DataInputStream(new FileInputStream(file));
			
			//读出数据类型
			System.out.println(dis.readDouble());
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			byte[] bts = new byte[2];
			dis.read(bts);
			System.out.println(new String(bts));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

