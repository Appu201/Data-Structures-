package Sorting;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; int i = low + 1; int j = high;
        while (i <= j){  //{9,7,5,14,2,3,6,10};
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            while (i <= j && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
public static void main(String[] args) {
    int arr[]= {11,7,2,5,8,9};
     quickSort(arr, 0, arr.length - 1);
    for(int i:arr) {
        System.out.print(i+"  ");
    }
}
}