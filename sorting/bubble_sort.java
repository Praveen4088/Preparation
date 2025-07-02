package sorting;

import java.util.Arrays;

// Sorting the array from the last element. Compare the element with next element in every iterations.
public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {25, 8, 7, 3, 6, 2};
        System.out.println("Before sorting :" + Arrays.toString(arr));
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After sorting :" + Arrays.toString(arr));
    }
}
