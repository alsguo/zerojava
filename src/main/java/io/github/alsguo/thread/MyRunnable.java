package io.github.alsguo.thread;

public class MyRunnable implements Runnable {

	public void run() {
		System.out.println("MyRunnable run...");
	}
	
	public static void main(String[] args) {
		Runnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
