package io.github.alsguo.thread;

interface StackInterface {
	public void push(int n);

	public int pop();
}

class UnsafeStack implements StackInterface {
	private int top = 0;
	private int[] values = new int[10];

	// No.1
	// 开始写代码。需求：分别实现往数组values中添加和取出数据的方法push()和pop()，模拟堆栈操作
	public void push(int n) {
		values[top++] = n;
		System.out.println("push " + n );
	}

	public int pop() {
		top--;
		int res = values[top];
		values[top] = 0;
		System.out.println("pop " + res);
		return res;
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

public class TestUnsafeStack {
	public static void main(String[] args) {
		UnsafeStack s = new UnsafeStack();
		s.push(1);
		s.push(2);
		// No.2
		// 开始写代码。需求：分别使用两个线程对堆栈s进行压栈和弹栈操作，并多执行几次，仔细查看执行结果并分析原因
		PushThread r1 = new PushThread(s);
		PopThread r2 = new PopThread(s);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		// end_code
	}
}