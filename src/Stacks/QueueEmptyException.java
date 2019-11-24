package Stacks;

public class QueueEmptyException extends Exception {

	public static final long serialVersionUID = 1L;
	
	QueueEmptyException(){
		super();
	}
	
	QueueEmptyException(String msg){
		super(msg);
	}
}
