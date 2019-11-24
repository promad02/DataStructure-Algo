package Queues;

public class CustomQueueDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomQueue queue = new CustomQueue(5);
		
		queue.enqueue(10);
		System.out.println(queue.peek());
		queue.enqueue(27);

		queue.enqueue(237);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

	}

}
