package CircularDeque;

public class Driver {

	public static void main(String[] args) {
		Main cq=new Main();
		cq.add("Apara");
		cq.add("Dhivya");
		cq.addFirst("Ano");
		cq.addFirst("Dharani");
		cq.add("Divya");
		cq.add("Dharshu");
        String val=cq.poll();
        System.out.println((val==null)?"Underflow":val);
        val=cq.pollLast();
        System.out.println((val==null)?"Underflow":val);
        val=cq.pollLast();
        System.out.println((val==null)?"Underflow":val);
        val=cq.pollLast();
        System.out.println((val==null)?"Underflow":val);
        val=cq.poll();
        System.out.println((val==null)?"Underflow":val);
        val=cq.poll();
        System.out.println((val==null)?"Underflow":val);
	}

}
