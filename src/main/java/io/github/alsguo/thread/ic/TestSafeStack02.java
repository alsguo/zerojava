package io.github.alsguo.thread.ic;

interface StackInterface {
	public void push(int n);

	public int pop();
}

class SafeStack implements StackInterface {
	private int top = 0;
	private int[] values = new int[1];
	// No.1
	// 开始写代码。需求：这个用数组模拟的堆栈，长度只有1，因此，如果堆栈中有数据，则压栈线程需要等待出栈线程将数据取出后才可以压栈；反之，如果堆栈中没有数据，则出栈线程需要等待压栈线程把数据压入后再执行出栈操作。定义push()和pop()方法，使得在压栈/出栈线程中执行相关操作的时候能满足前面的要求
	private boolean dataAvailable = false;

	public void push(int n) {
		synchronized (this) {
			while (dataAvailable) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			values[top] = n;
			System.out.println("push " + n);
			dataAvailable = true;
			top++;
			notifyAll();
		}
	}

	public int pop() {
		synchronized (this) {
			while (!dataAvailable) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			top--;
			int n = values[top];
			values[top] = 0;
			dataAvailable = false;
			System.out.println("pop " + n);
			notifyAll();
			return n;
		}
	}
	// end_code
}

class PushThread implements Runnable {
	private StackInterface s;

	public PushThread(StackInterface s) {
		this.s = s;
	}

	public void run() {
		int k = 15;
		s.push(k);
	}
}

class PopThread implements Runnable {
	private StackInterface s;

	public PopThread(StackInterface s) {
		this.s = s;
	}

	public void run() {
		s.pop();
	}
}

public class TestSafeStack02 {
	public static void main(String[] args) {
		SafeStack s = new SafeStack();
		PopThread r0 = new PopThread(s);
		PushThread r1 = new PushThread(s);
		PopThread r2 = new PopThread(s);
		PushThread r3 = new PushThread(s);
		Thread t0 = new Thread(r0);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t3.start();
		t0.start();
		t1.start();
		t2.start();
	}
}