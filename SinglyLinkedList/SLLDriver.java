package SinglyLinkedList;

public class SLLDriver{

	public static void main(String[] args) {

		SinglyLL  sll=new SinglyLL();

		sll.inBegin(3);
		sll.inBegin(15);
		sll.inBegin(7);
		sll.inBegin(21);
		sll.atEnd(24);
		sll.inBegin(20);		
		sll.atEnd(24);		
		sll.inPosition(10,3);		
		sll.afterVal(79, 7);		
		sll.beforeVal(65, 10);	
		sll.bubbleSort();
		sll.printLL();
		sll.search(21);

	} 
}