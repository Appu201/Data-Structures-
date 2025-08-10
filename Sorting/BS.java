package Sorting;

import java.util.Arrays;

public class BS {

    void selectionSort(int arr[]) {
        System.out.println("Original (Selection Sort): " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        System.out.println("Sorted (Selection Sort): " + Arrays.toString(arr));
    }

    void bubbleSort(int arr[]) {
        System.out.println("Original (Bubble Sort): " + Arrays.toString(arr));
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }
            }
        }
        System.out.println("Sorted (Bubble Sort): " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        BS r = new BS();
        int arr1[] = {12, 8, 20, 5, 3, 7};
        r.selectionSort(arr1);

        int arr2[] = {12, 8, 20, 5, 3, 7};
        r.bubbleSort(arr2);
    }
}