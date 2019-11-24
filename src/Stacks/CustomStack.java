package Stacks;

public class CustomStack {
	int size;
	int arr[];
	int top;
	
	CustomStack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	CustomStack() {}
	
	public void push(int item) {
		if(!isFull()) {
			top++;
			arr[top]=item;
			System.out.println(item + " is pushed into the stack");
		}
		else {
			System.out.println("Stack is full");
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int poppedTop = top;
			top--;
			System.out.println("Popping from Stack: ");
			return arr[poppedTop];
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public int peek() {
		if(!isEmpty()) {
			System.out.println("Item on the top is: ");
			return arr[top];
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	

	
	public boolean isFull() {
		return (top == size-1);
	}
	
	public void printStack() {
		while(!isEmpty()) {
			System.out.println(pop());
		}
	}

}
