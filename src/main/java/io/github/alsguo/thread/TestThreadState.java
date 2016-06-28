package io.github.alsguo.thread;

class TestThreadState implements Runnable {
	public void run() {
		// No.1
		// 开始写代码。执行输出0-30的任务，当可以被10整除时，休眠2秒。
		for (int i = 0; i < 30; i++) {
			if(i%10==0){
				try {
					System.out.println(i);
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// end_code
	public static void main(String[] args) {
		TestThreadState tts = new TestThreadState();
		Thread thread = new Thread(tts);
		thread.start();
	}
}