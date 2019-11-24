package Stacks;

public class StackUsingTwoQDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingTwoQueues stack = new StackUsingTwoQueues();
		
//		try {
//			stack.pop();
//		} catch (QueueEmptyException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		stack.push(10);
		try {
			System.out.println(stack.pop());
		} catch (QueueEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
