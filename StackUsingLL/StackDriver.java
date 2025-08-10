package StackUsingLL;

public class StackDriver {
	public static void main(String[] args) {

		StackLL  st=new StackLL();
		
		
		st.push(3);
		st.push(2);
		st.push(1);
		st.push(6);
		st.push(9);
		st.push(5);

		
		int val=st.pop();
		System.out.println((val==Integer.MIN_VALUE)?"Stack Underflow":val);
		val=st.pop();
		System.out.println((val==Integer.MIN_VALUE)?"Stack Underflow":val);
		val=st.pop();
		System.out.println((val==Integer.MIN_VALUE)?"Stack Underflow":val);
		val=st.pop();
		System.out.println((val==Integer.MIN_VALUE)?"Stack Underflow":val);
		val=st.pop();
		System.out.println((val==Integer.MIN_VALUE)?"Stack Underflow":val);
		val=st.pop();
		System.out.println((val==Integer.MIN_VALUE)?"Stack Underflow":val);
		val=st.peek();
		System.out.println((val==Integer.MIN_VALUE)?"Stack Underflow":val);
	
	} 

}

