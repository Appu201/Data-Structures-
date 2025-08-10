package QueueUsingArray;

import QueueUsingArray.QueueArr;

public class Driver {
	public static void main(String[] args) {
		QueueArr q=new QueueArr();
		q.add("Dhoni");
		q.add("Dravid");
		q.add("Rohit");
		q.add("Virat");
		q.add("Sachin");
		String val=q.poll();
		System.out.println((val==null)?"Underflow":val);
		val=q.poll();
		System.out.println((val==null)?"Underflow":val);
		val=q.poll();		
		System.out.println((val==null)?"Underflow":val);
		val=q.poll();		
		System.out.println((val==null)?"Underflow":val);
		val=q.poll();		
		System.out.println((val==null)?"Underflow":val);
		val=q.poll();
		
		
	}
	
	

}