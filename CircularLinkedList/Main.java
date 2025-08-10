package CircularLinkedList;

class Node{
	int data;
	int pos;
	Node next;
}

class Process extends Node{
	Node head; // creating head
	Node tail; // creating tail
	
	
//INSERT BEGINNING
	
	void insertBegin(int data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		if(head==null) {
			head=newNode;
			newNode.next=head;	
		}
		else {
			Node temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.next=head;
			head=newNode;
		}	
	}
	
	
//INSERT AT END
	
	void insertEnd(int data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		if(head==null) {
			head=newNode;
			newNode.next=head;
		}
		else {
			Node temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			newNode.next=head;
			temp.next=newNode;
		}
	}
	
	
//INSERT AT POSITION
	
	void insertPos(int data,int pos) {
		Node temp=head;
		Node newNode=new Node();
		newNode.data=data;
		if(pos==0) {
			insertBegin(data);
			return;
		}
		int i;
		for(i=1;i<pos&&temp.next!=head;i++) {
			temp=temp.next;
		}
			newNode.next=temp.next;
			temp.next=newNode;
		}
	
	
//DELETE BEGIN
	
	void deleteBegin() {
		if(head==null) {
			System.out.println("LL is empty");		
		}
		Node temp=head;
		while(temp.next!=head) {
			temp=temp.next;
		}
		head=head.next;
		temp.next=head;
	}		
	

//DELETE END
	
	void deleteEnd() {
		Node temp=head;
		while(temp.next.next!=head) {
			temp=temp.next;
		}
		temp.next=head;
		
	}

//DISPLAY
	
	void display() {
		Node temp=head;
		while(temp.next!=head) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
}


//DRIVER
	
public class Main {

	public static void main(String[] args) {
		Process cll=new Process();
		cll.insertBegin(4);
		cll.insertBegin(3);
		cll.insertBegin(2);
		cll.insertBegin(1);
		cll.insertEnd(5);
		cll.insertEnd(6);
		cll.insertPos(7,6);
		cll.deleteBegin();
		cll.deleteEnd();
		cll.display();
	}

}
