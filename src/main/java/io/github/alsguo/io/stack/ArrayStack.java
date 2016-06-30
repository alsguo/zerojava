package io.github.alsguo.io.stack;

public class ArrayStack implements Stack {

	private Object[] arrs;
	private int top;
	private final static int SIZE = 10;

	public ArrayStack() {
		arrs = new Object[SIZE];
		top = 0;
	}
	
	//默认扩容原来的一倍大小
	public void expand(){
		Object[] larger = new Object[size() * 2];
		for (int i = 0; i < top; i++) {
			larger[i] = arrs[i];
		}
		arrs = larger;
	}
	
	public void push(Object o) {
		if (top == arrs.length) {
			expand();
		}
		arrs[top] = o;
		top++;
	}

	public Object pop() {
		if(isEmpty()){
			return null;
		}
		top--;
		Object o = arrs[top];
		arrs[top] = null;
		return o;
	}

	public boolean isEmpty() {
		return (size() == 0);
	}

	public int size() {
		return top;
	}

}
