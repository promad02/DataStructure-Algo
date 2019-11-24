package Queues;

public class CustomQueue {
	int size;
	int arr[];
	int front,rear,currentSize=0;
	
	CustomQueue(int size) {
		this.size = size;
		this.arr = new int[size];
		this.rear = -1;
		this.front = 0;
	}
	
	CustomQueue() {}
	
	public void enqueue(int item) {
		if(!isFull()) {
			rear++;
			arr[rear]=item;
			currentSize++;
			System.out.println(item + " is enqueued");
		}
		else {
			System.out.println("Queue is full");
		}
	}
	
	public int dequeue() {
		if(!isEmpty()) {
			int poppedTop = front;
			front++;
			currentSize--;
			System.out.println("Dequeuing: ");
			return arr[poppedTop];
		}
		else {
			System.out.println("Queue is empty");
			return -1;
		}
	}
	
	public int peek() {
		if(!isEmpty()) {
			System.out.println("Item at the front is: ");
			return arr[front];
		}
		else {
			System.out.println("Queue is empty");
			return -1;
		}
	}
	
	public boolean isEmpty() {
		return (currentSize == 0);
	}
	

	
	public boolean isFull() {
		return (currentSize == size);
	}
	
	public void printStack() {
		while(!isEmpty()) {
			System.out.println(dequeue());
		}
	}

}
