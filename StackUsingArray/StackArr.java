package StackUsingArray;

public class StackArr {
	int cap=5;
	int top=-1;
	String arr[]=new String[cap];
	
	void push(String data) {
		if(top>=cap-1) {
			System.out.println("Stack Overflow");
			return;
		}
		arr[++top]=data; //increment before return
	}
	
	
	String pop() {
		if(top<=-1) {
			return null;
		}
		else {
			return arr[top--]; //decrement after return
		}
	}
	
	
	String peek() {
		if(top<=-1) {
			return null;
		}
		else {
			return arr[top]; 
		}
	}
	
}

