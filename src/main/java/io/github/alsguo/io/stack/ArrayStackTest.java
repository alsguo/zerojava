package io.github.alsguo.io.stack;

public class ArrayStackTest {

	public static void main(String[] args) {
		Stack stack = new ArrayStack();
		
		//入栈
		for (int i = 0; i < 15; i++) {
			stack.push(i);
		}
		
		//出栈
		for (int i = 0; i < stack.size(); ) {
			System.out.println(stack.pop());
		}
	}
}
