package Inpostout;

public class Stack {
	int top = -1;
	static final int MAX = 100;
	char[] stack = new char[MAX];

	public void push(int i) {
		if (top > MAX) {
			System.out.println("Stack full");
		} else {
			stack[++top] = (char) i;
		}
	}

	public char pop() {
		if (!isEmpty()) {
			return stack[top--];
		} else {
			return 0;
		}
	}

	public boolean isEmpty() {
		if (top < 0) {
			return true;
		} else {

			return false;
		}
	}
	public char stackTop() {
		return stack[top];
	}
}
