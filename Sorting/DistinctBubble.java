package Sorting;
import java.util.Arrays;

public class DistinctBubble  {
	void bubbleSort(int arr[]) {
		System.out.println(Arrays.toString(arr));
		boolean swap=true;
		while(swap) {
			swap=false;
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					swap=true;
				}
			}
		}
	}
		
	public static void main(String[] args) {
		DistinctBubble  r=new DistinctBubble ();
		int arr[]= {5,7,12,11,10,9,7,12,1,1};
		int res[]=new int[arr.length];
	    int ind=0;
		System.out.println(Arrays.toString(arr));
		r.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	    for(int i=0;i<arr.length-1;i++) {
	    	if(arr[i]!=arr[i+1]) {
	    		res[ind++]=arr[i];
	    		}
	    	}
	    res[ind++]=arr[arr.length-1];
	    for(int i=0;i<ind;i++) {
	    	System.out.print(res[i]+" ");
	    }
	    System.out.println("\n"+ind+" Distinct Elements");
	}

}
