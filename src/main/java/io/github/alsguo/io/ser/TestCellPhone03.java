package io.github.alsguo.io.ser;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestCellPhone03 implements Serializable {
	public static void main(String[] args) {
		new TestCellPhone03().run();
	}

	private void run() {
		try {
			FileOutputStream fos = new FileOutputStream("cellphone.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(new CellPhone("abcdefghij12345", "Apple", 200));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("cellphone.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			CellPhone phone = (CellPhone) obj;
			System.out.println(phone.getBrand());
			System.out.println(phone.getImei());
			System.out.println(phone.getWeight());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	class CellPhone implements Serializable {
		String brand;
		int weight;
		String imei;

		public CellPhone(String imei, String brand, int weight) {
			this.brand = brand;
			this.weight = weight;
			this.imei = imei;
		}

		public String getImei() {
			return this.imei;
		}

		public String getBrand() {
			return this.brand;
		}

		public int getWeight() {
			return this.weight;
		}

		// No.1
		// 开始写代码。通过自定义writeObject()和readObject()的方法实现自定义对象系列化，不允许imei属性被系列化
		private void writeObject(ObjectOutputStream out) throws IOException {

			out.writeObject(brand);
			out.writeInt(weight);
		}

		private void readObject(ObjectInputStream in) throws IOException,
				ClassNotFoundException {
			brand = (String) in.readObject();
			weight = in.readInt();
		}
		// end_code
	}
}