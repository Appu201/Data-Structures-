package Sorting;
import java.util.Arrays;
public class OnlyOnceBubble  {
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
		OnlyOnceBubble  r=new OnlyOnceBubble ();
		int arr[]= {5,7,12,11,10,9,7,12,1,1};
		r.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]!=arr[i+1]) {
		    		System.out.print(arr[i]+" ");
		    	}
		    }
		   }
	}
	