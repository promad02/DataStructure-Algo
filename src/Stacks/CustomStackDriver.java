package Stacks;

public class CustomStackDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomStack stack = new CustomStack(5);
		
		stack.push(10);
		System.out.println(stack.peek());
		stack.push(27);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
