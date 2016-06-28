package io.github.alsguo.thread;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println("MyThread run ...");
	}
	
	public static void main(String[] args) {
		Thread thread = new MyThread();
		thread.start();
	}
}
