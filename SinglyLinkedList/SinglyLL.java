package SinglyLinkedList;

public class SinglyLL {
	Node head=null; //initially head is null that is empty LL
	
	
//INSERTING AT THE BEGINNING
	
	void inBegin(int data) { //creating method for inserting at beginning, data pass
		Node newNode= new Node(data); /*creating object for the Node class (newNode) 
		                                for the value given in the above method*/
		newNode.next=head; //the newNode is pointing to head
		head=newNode; //the newNode is the head and is inserted at beginning
		return;
	}
	
	
	
//INSERTING AT THE END
	
	void atEnd(int data) { //creating method for inserting at end, data pass 
		Node newNode= new Node(data); //creation of node
		if(head==null){ //if LL is empty
			newNode.next=head;
			head=newNode; // newNode is head
		}
		Node current=head; //if LL has data
		while(current.next!=null) { //traversing until null
			current=current.next;
		}
		current.next=newNode; //it is inserted at end
	}
	
	

//INSERTING AT A POSITION
	
	void inPosition(int data,int pos) { //creating method for inserting at a position, data pass 
		Node newNode= new Node(data);//creation of node
	 	if(head==null){ //if LL is empty
	 		newNode.next=head;
	 		head=newNode; // newNode is head
	 		return;
	}
		if(pos==0) {//to avoid out of boundary
			inBegin(data);
			return;
		}
	int count=1;
	Node current=head; //if LL has data
	while(current!=null) { /*traversing until null
	                         if we want to be the index and not direct
	                         then we use current.next*/
		if(count==pos) { //checking if position has been reached
			newNode.next=current.next;
			current.next=newNode; //assigning the continuing values
			return;
		}
		count++; //increasing position
		current=current.next;
	}
	System.out.println("Out of Boundary");
}

	

//INSERTING AFTER A VALUE
	
	void afterVal(int data,int val) {
		if(head==null) {
			System.out.println("LL is empty ");
			return;
		}
		Node current=head;
		while(current.next!=null && current.data!=val) {
			current=current.next;
		}
		if(current.data==val) {
			Node newNode=new Node(data);
			newNode.next=current.next;
			current.next=newNode;
			return;
		}
		System.out.println("Value not found in the LL");
	}
	
	
	
//INSERTING BEFORE A VALUE
	
	void beforeVal(int data,int val) {
		if(head==null) {
			System.out.println("LL is empty ");
			return;
		}
		if(head.data==val) {
			inBegin(data);
			return;
		}
		Node current=head;
		while(current.next!=null && current.next.data!=val) {
			current=current.next;       
		}
		if(current.next!=null && current.next.data==val) {
			Node newNode=new Node(data);
			newNode.next=current.next;
			current.next=newNode;
			return;	
	  }
		System.out.println("Val not in the list");
	}
	
	
	
//DELETING AT THE BEGINNING
	
	void delBegin() { //creating method for DELETING AT POSITION, data pass 
	 	if(head==null) { //if LL is empty
	 		System.out.println("Linked List is Empty");//nothing is performed
	        return;
	        }
		head=head.next; //it is deleted
	}
	
	
	
//DELETING AT THE END
	
	void delEnd() { //creating method for DELETING AT POSITION, data pass 
	 	if(head==null) { //if LL is empty
	 		System.out.println("Linked List is Empty");//nothing is performed
	        return;
	 	}
		Node current=head; //if LL has data
		while(current.next.next!=null) { //traversing until null
			current=current.next;
		}
		current.next=null; //it is deleted at end
	}
       
	        
	  
//DELETING AT A POSITION
	
	void delPosition(int pos) { //creating method for DELETING AT POSITION, data pass 
	 	if(head==null) { //if LL is empty
	 		System.out.println("Linked List is Empty");//nothing is performed
	        return;
	}
	 	
	if(pos==0) {//to avoid out of boundary
		head=head.next;
	}
	
	int count=1;
	Node current=head; //if LL has data
	while(current!=null) { /*traversing until null
	                         if we want to be the index and not direct
	                         then we use current.next*/
		if(count==pos) { //checking if position has been reached
			current.next=current.next.next;//deleting the data
			return;
		}
		count++; //increasing position
		current=current.next;
	}
	System.out.println("Out of Boundary");
	}



//DELETE A VALUE
	
	void deleteVal(int val) {
		if(head==null) {
		System.out.println("LL is empty");
		return;
	}
		if(head.data==val) {
			head=head.next;
			return;
	}
		Node current=head;
		while(current.next!=null && current.next.data!=val) {
		current=current.next;
	}
		if(current.next!=null && current.next.data==val) {
			current.next=current.next.next;
			return;
	}
		System.out.println("Val not in the list");
	}
		void deletePos(int pos) {
			if(head==null) {
					System.out.println("Empty LL can't Delete");
						return;
	}
		if(pos==0) {
			head=head.next;
			return;
	}
		int count=1;
		Node current=head;
		while(current.next!=null) {
			if(count==pos) {
					current.next=current.next.next;
					return;
	}
		count++;
		current=current.next;
	}
		System.out.println("Index Out of Bound");
	}
		
//SEARCH
		void search(int val) {
			if(head==null) {
				System.out.println("LL is empty");
				return;
			}
			Node current=head;
			int pos=0;
			while(current!=null) {
				if(current.data==val) {
					System.out.println(val+" in the position: "+pos);
					return;
				}
				pos++;
				current=current.next;
			}
			System.out.println(val+" not in the position"); 
		}
		
//BUBBLE SORT
		void bubbleSort() {
			if(head ==null) {
				return;
			}
			Node current=head;
			boolean flag=true;
			while(flag) {
				flag=false;
				while(current.next!=null) {
					if(current.data>current.next.data) {
						int temp=current.data;
						current.data=current.next.data;
						current.next.data=temp;
						flag=true;
					}
					current=current.next;
				}
				current=head;
			}
		}
		
//PRINT LL

	void printLL() { 
		if(head==null){ //if LL is empty
			System.out.println("LL is empty"); 
			return;
		}
		Node current=head; //if LL has data
		while(current.next!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println(current.data);
	}
}


