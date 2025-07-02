package sorting;

import java.util.Arrays;

// First element is compared with every other elements and gets swapped with the minimum number.
// It will be done until the array is sorted.
public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {25, 8, 7, 3, 6, 2};
        System.out.println("Before sorting :" + Arrays.toString(arr));

        int temp;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {                     // This loop is to tranverse an array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {                 // This loop is to find index of minimum number
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After sorting :" + Arrays.toString(arr));
    }
}
