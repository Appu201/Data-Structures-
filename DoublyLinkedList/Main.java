package DoublyLinkedList;

class Node{
	int data;
	int pos;
	Node prev;
	Node next;
}

class Process extends Node{
	Node head; // creating head
	Node tail; // creating tail
	
	
//INSERT AT BEGINNING
	
	void insertBegin(int data) {
		Node newNode= new Node(); // creating newNode
		newNode.data=data; //passing data
		newNode.next=null; //starting both are null
		newNode.prev=null;
		if(head==null) { // check if LL is empty
			head= newNode; //bcz there is only one node
			tail= newNode;	
		}
		else {
			head.prev=newNode; //inserting
			newNode.next=head; //making newNode as the head
			head=newNode; // head is now the newNode
		}
	}
	
	
//INSERT AT END
	
	void insertEnd(int data) {
		Node newNode= new Node(); // creating newNode
		newNode.data=data; //passing data
		newNode.next=null;//starting both are null
		if(head==null) { // check if LL is empty
			head= newNode; //bcz there is only one node
			tail= newNode;	
		}
		else {
			tail.next=newNode; // tail next points to newNode
			newNode.next=null; // newNode's next becomes null
			tail=newNode; // newNode becomes the tail
		}
	}
	
	
//INSERT AT POSITION
	
	void insertPos(int data,int pos) { // creating newNode
		Node newNode= new Node();
		newNode.data=data; //passing data
		newNode.next=null; //starting both are null
		newNode.prev=null;
			if(pos==0) { //if the position is at beginning
				insertBegin(data);
				return;
			}
			else {
				int count=1; //initialize count
				Node current=head; //start current at head
				while(current!=null && count<pos) { //boundaries
					current=current.next; //traversing
					count++;
				}
					if(count==pos) { //reached
					      if (current == null) { //if it is at the end
					    	  insertEnd(data);
					    	  return;
					      }
					      else {
					    	  newNode.prev=current.prev;
					    	  newNode.next=current;
					    	  current.prev.next =newNode;
					    	  current.prev=newNode;
					    	  return;
					      }
					}
			 else {
				System.out.println("Out of Boundary");
			 }
		}
	}
	
	
//DELETE AT BEGINNING
	
	void deleteBegin() { 
		Node temp=head; //assign temp as head
		if(head==null) { //if LL is empty
			System.out.println("LL is empty");
		}
		else {
			temp.next.prev=null; //removing head by removing link
			head=head.next; //assigning new head
		}
	}
	
	
//DELETE AT END
	
	void deleteEnd() {
		Node temp=tail;
		if(temp==null) {
			System.out.println("LL is empty");
		}
		else {
			temp.prev.next=null;
			tail=tail.prev;
		}
	}
	
	
//DELETE AT POSITION
	
	void deletePos(int pos) {
	    if(head==null) {
	        System.out.println("LL is is empty");
	        return;
	    }
	    Node current=head;
	    int count=0; 
	    
	    while(current!=null && count<pos) {
	    	current=current.next;
	        count++;
	    }
	    if(current==null) {
	        System.out.println("Out of boundary");
	        return;
	    } // remove temp
	    if(current==head) { //check if current is head
	        head=current.next; //move head
	        if (head!=null) { //check for more nodes
	            head.prev=null; //creating new head
	        }
	    } else { // re linking
	    	current.prev.next=current.next; //moving prev node after current
	        if(current.next!=null) { //check if temp is last node
	        	current.next.prev=current.prev; //curent node is previous
	        }
	    } 
	    current.next=null;
	    current.prev=null;
	    }
	
	
//DISPLAY
	
	void display() {
		Node temp= head; // creating temp node and making it head
		while(temp!=null) { // traversing until ending of LL
			System.out.println(temp.data); // printing temp
			temp=temp.next; // making temp move to next node
		}
		
	}
	
//REVERSE DISPLAY
	
	void revDisplay() {
		Node temp= tail; // creating temp node and making it tail
		while(temp!=null) { // traversing until beginning of LL
			System.out.println(temp.data); // printing temp
			temp=temp.prev; // making temp move to prev node
		}
		
	}


//SEARCH	
	void search(int key) {
		Node temp=head;
		int  pos=0;
		boolean found= false;
		
		while(temp!=null) {
			if(temp.data==key) {
				System.out.println("Element "+key+" found at position "+pos);
				found=true;
				break;
			}
			temp=temp.next;
			pos++;
		}
		if(!found) {
			System.out.println("Element "+key+" not found in the LL");
		}
	}
}

//DRIVER 

public class Main {
	public static void main(String[] args) {
		Process dll=new Process();
		dll.insertBegin(6);
		dll.insertBegin(5);
		dll.insertBegin(3);
		dll.insertBegin(2);
		dll.insertBegin(1);
		dll.insertPos(4,4);
		dll.deletePos(3);
		dll.display();
		System.out.println("Reversed LL:");
		dll.revDisplay();
		dll.search(5);
	}
}
