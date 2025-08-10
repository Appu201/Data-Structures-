package SingleLinkedList;

class Node{
	int data;
	Node link;
}

class SingleLL extends Node{
	Node head=null;
	void insertBegin(int data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.link=null;
		if(head==null) {
			head=newNode;
		}
		else {
			newNode.link=head;
			head=newNode;
		}
	}
	void insertEnd(int data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.link=null;
		Node temp=head;
		while(temp.link!=null) {
			temp=temp.link;           
		}
	}
	
}
public class Main {

}
