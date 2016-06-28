package io.github.alsguo.io.ser;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class TestCellPhone04 implements Serializable{
	
	
	public static void main(String[] args){
		new TestCellPhone04().run();
	}
	private void run() {
		try{
			FileOutputStream fos = new FileOutputStream("cellphone.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(new CellPhone("abcdefghij12345","Apple",200,new Manufactor()));
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		try{
			FileInputStream fis = new FileInputStream("cellphone.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			CellPhone phone = (CellPhone)obj;
			System.out.println(phone.getBrand());
			System.out.println(phone.getImei());
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	
	
	class Manufactor implements Serializable{
		
	}
	class CellPhone implements Serializable{
		private static final long serialVersionUID = -3538799502457823993L;
		String brand;
		int weight;
		//No.1
		//开始写代码。需求：定义一个String类型的imei属性和Manufactor类型的man属性，这2个属性将不会被系列化
		transient String imei;
		transient Manufactor man;
		//end_code
		
		public CellPhone(String imei,String brand,int weight,Manufactor man){
			this.brand = brand;
			this.weight = weight;
			this.imei = imei;
			this.man = man;
		}
		public String getImei(){
			return this.imei;
		}
		public String getBrand(){
			return this.brand;
		}
		public int getWeight(){
			return this.weight;
		}
	}
}