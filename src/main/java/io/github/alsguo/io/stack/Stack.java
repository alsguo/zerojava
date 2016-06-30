package io.github.alsguo.io.stack;

public interface Stack {

	void push(Object o); // 压栈

	Object pop();// 出栈

	boolean isEmpty();

	int size();

}
