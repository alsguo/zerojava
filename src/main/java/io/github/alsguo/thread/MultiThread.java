package io.github.alsguo.thread;
class PrintRunnable implements Runnable{
	private int i = 1;
	//No.1
	//开始写代码。需求：打印出i从1-30的值，且在数字前加上当前线程的名字

	public void run() {
		for (; i <= 30; i++) {
			System.out.println(Thread.currentThread().getName()+" " + i);
		}
	}
	                  
	//end_code
}
public class MultiThread{
	public static void main(String[] args){
		//No.2
		//开始写代码。需求：使用同一个PrintRunnable对象，分别启动2个线程，并分别给这个线程命名为t1和t2
		PrintRunnable runnable = new PrintRunnable();
		Thread thread1 = new Thread(runnable,"t1");
		Thread thread2 = new Thread(runnable,"t2");
		thread1.start();
		thread2.start();
		//end_code
	}
}