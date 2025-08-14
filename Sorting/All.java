package Sorting;
import java.util.Arrays;

public class All {
	    void insertionSort(int arr[]) {
	        int n=arr.length;
	        for(int i=1;i<n;i++) {
	            int key=arr[i];
	            int j=i-1;
	            while(j>=0 && arr[j]>key) {
	                arr[j+1]=arr[j];
	                j=j-1;
	            }
	            arr[j+1]=key;
	        }
	    }
	    
	    void bubbleSort(int arr[]) {
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
	    
	    void selectionSort(int arr[]) {
	        for(int i=0;i<arr.length-1;i++) {
	            for(int j=i+1;j<arr.length;j++) {
	                if(arr[i]>arr[j]) {
	                    int t=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=t;
	                }
	            }
	        }
	    }
	    
	    public static void main(String[] args) {
	        All s=new All();
	        int arr[]= {5,9,1,6,8};
	        s.insertionSort(arr);
	        s.bubbleSort(arr);
	        s.selectionSort(arr);
	        System.out.println(Arrays.toString(arr));
	    }
	}

