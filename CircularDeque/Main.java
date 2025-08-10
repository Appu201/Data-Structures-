package CircularDeque;

public class Main {
	int capacity=5;
	int front=-1;
	int rear=-1;
	int size=0;
	String arr[]=new String[capacity];
	
	boolean isEmpty() {
		return (size==0)?true:false;
	}
	
	boolean isFull() {
		return size==capacity;
	}
	
	void add(String data) {
		if(isFull()) {
			System.out.println("Overflow");
			return;
		}
		if(isEmpty()) {
			front=rear=0;
		}
		else {
			rear=(rear+1)%capacity;
		}
		arr[rear]=data;
		size++;
		return;
		}
	
	void addFirst(String data) {
		if(isFull()) {
			System.out.println("Overflow");
			return;
		}
		if(isEmpty()) {
			front=rear=0;
		}
		else {
			front=(front-1+capacity)%capacity;
		}
		arr[front]=data;
		size++;
		}
	
	String poll() {
		if(isEmpty()) {
			return null;
		}
		String data=arr[front];
		if(front==rear) {
			front=rear=-1;
		}
		else {
		front=(front+1)%capacity;
		}
		size--;
		return data;
	}
	
	String pollLast() {
		if(isEmpty()) {
			return null;
		}
		String data=arr[rear];
		if(front==rear) {
			front=rear=-1;
		}
		else {
			rear=(rear-1+capacity)%capacity;
		}
		size--;
		return data;

	}

}
