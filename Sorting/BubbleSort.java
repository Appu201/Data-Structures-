package Sorting;

import java.util.Arrays;
public class BubbleSort {
	
	void selectionSort(int arr[]) {
		System.out.println("Selection Sort:");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
			}
		}
	}
  }
	void bubbleSort(int arr[]) {
		System.out.println("Bubble Sort:");
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
		void meth(int num) {
			num=10;
	}

	public static void main(String[] args) {
		BubbleSort r=new BubbleSort();
		int num=5;
		r.meth(num);
		System.out.println(num);
		int arr[]= {12,8,20,5,3,7};
		r.selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		int arr1[]= {12,8,20,5,3,7};
		r.bubbleSort(arr1);
		System.out.println(Arrays.toString(arr1));
		
				  
	}
}
    



