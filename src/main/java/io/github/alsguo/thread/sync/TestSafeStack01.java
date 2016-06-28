package io.github.alsguo.thread.sync;
interface StackInterface{
	public void push(int n);
	public int pop();
}


class SafeStack implements StackInterface {
	private int top = 0;
	private int[] values = new int[10];
	//No.1
	//开始写代码。在出栈线程和压栈线程对堆栈（数组values）进行操作的时候，需要确保数据的完整性。请完成压栈和出栈方法push()/pop()的定义，使得它们满足前面的要求。
	public void push(int n) {
		synchronized (this) {
			values[top++] = n;
			System.out.println("push " + n );
		}
	}

	public int pop() {
		synchronized (this) {
			top--;
			int res = values[top];
			values[top] = 0;
			System.out.println("pop " + res);
			return res;
		}
	}
	
	//end_code
}
class PushThread implements Runnable {
      private StackInterface s;

      public PushThread(StackInterface s){
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


public class TestSafeStack01 {
	public static void main(String[] args) {
		SafeStack s = new SafeStack();
		s.push(1); 
		s.push(2); 
		PushThread r1 = new PushThread(s);
		PopThread r2 = new PopThread(s);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start(); 
		t2.start(); 
	}
}