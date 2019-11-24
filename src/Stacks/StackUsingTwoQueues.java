package Stacks;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {

	Queue<Integer> queue1;
	Queue<Integer> queue2;
	
	public StackUsingTwoQueues() {
		queue1= new LinkedList<Integer>();
		queue2= new LinkedList<Integer>();
		
	}
	
	public void push(int item) {
		if(queue1.size()==0) {
			queue1.add(item);
		}
		else {
			int queue1Size = queue1.size();
			for(int i =0; i<queue1Size; i++)
				queue2.add(queue1.remove());
			queue1.add(item);
			for(int i=0;i<queue1Size;i++)
				queue1.add(queue2.remove());
		}
		System.out.println(item+" has been pushed");
	}
	
	public int pop() throws QueueEmptyException {
		if(queue1.size()==0) {
			throw new QueueEmptyException("Underflow exception");
		}
		return queue1.remove();
	}
	
}
