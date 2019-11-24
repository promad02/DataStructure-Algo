package Stacks;

public class SortStackUsingStack {
	
	public static CustomStack sortStack(CustomStack stack) {
		CustomStack tempStack = new CustomStack(10);
		while(!stack.isEmpty()) {
			int currentItem = stack.pop();
			while(!tempStack.isEmpty() && tempStack.peek() < currentItem) {
				stack.push(tempStack.pop());
			}
			tempStack.push(currentItem);
		}
		
		System.out.println("**************Sorted Stack*************");
		
		tempStack.printStack();
		return tempStack;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomStack stack = new CustomStack(4);
		stack.push(1);
		stack.push(5);
		stack.push(8);
		stack.push(3);
		
		stack=sortStack(stack);
		
		stack.printStack();

	}

}
