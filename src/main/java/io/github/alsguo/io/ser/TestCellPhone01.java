package io.github.alsguo.io.ser;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//No.1
//开始写代码。需求：定义一个类CellPhone，有String属性brand和int类型属性weight。让CellPhone对象可以保存到磁盘或者在网络之间传递

class CellPhone implements Serializable {
	private String brand;
	private int weight;

	public CellPhone(String brand, int weight) {
		super();
		this.brand = brand;
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}

// end_code
public class TestCellPhone01 {
	public static void main(String[] args) {
		// No.2
		// 开始写代码。需求：创建一个CellPhone对象，并将其保存到文件cellphone.ser中
		try {
			ObjectOutputStream os = new ObjectOutputStream(
					new FileOutputStream("cellphone.ser"));
			os.writeObject(new CellPhone("Apple", 100));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// end_code

		// No.3
		// 读取cellphone.ser文件中的对象
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cellphone.ser"));
			CellPhone phone = (CellPhone) ois.readObject();
			System.out.println(phone.getBrand());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}