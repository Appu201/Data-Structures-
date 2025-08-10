package StackUsingArray;

public class StackDriver {

	public static void main(String[] args) {
		StackArr st=new StackArr();
		System.out.println(st.cap);
		st.push("Appu");
		st.push("Dhivya");
		st.push("Ano");
		st.push("Chithu");
		st.push("Divya");
		st.push("Dharshu");
		System.out.println((st.peek()==null)?"Underflow":st.peek());
		String res=st.pop();
		System.out.println((res==null)?"Underflow":res);
		res=st.pop();
		System.out.println((res==null)?"Underflow":res);

	}

}
