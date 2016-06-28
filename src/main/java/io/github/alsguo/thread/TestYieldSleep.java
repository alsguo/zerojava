package io.github.alsguo.thread;

public class TestYieldSleep {
	public static void main(String[] args) {
		PrintThread pt1 = new PrintThread("t1");
		PrintThread pt2 = new PrintThread("t2");
		pt1.start();
		pt2.start();
	}
}

class PrintThread extends Thread {
	public PrintThread(String name) {
		super(name);
	}

	// No.1
	// 开始写代码。需求：连续打印1-30的数字，当可以被5整除时，休眠20毫秒，观察并分析线程的运行过程。然后将休眠改成yield()，重新运行并观察分析线程运行过程。
	@Override
	public void run() {
		for (int i = 1; i <= 30; i++) {
			if (i % 5 == 0) {
				System.out.println(getName()+" : " + i);
				Thread.yield();
			}
		}
	}
	// end_code
}