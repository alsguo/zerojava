package io.github.alsguo.io;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("test.txt");
		if(file.exists()){
			file.renameTo(new File("data.txt"));//修改文件名称
		}
		
		File dirs = new File("c:/als/demo");
		if(dirs.exists()){
			dirs.mkdirs();//创建目录
			dirs.getAbsolutePath();//当前的绝对路径
			dirs.getParentFile().getAbsolutePath();//父目录绝对路径
		}
	}
}
