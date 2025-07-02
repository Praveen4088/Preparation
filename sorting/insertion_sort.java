package sorting;

import java.util.Arrays;

// Compare the key with the previous elements and shift them to the right until the correct position for the key is found.

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {25, 8, 7, 3, 6, 2};
        System.out.println("Before sorting :" + Arrays.toString(arr));
        int n=arr.length;
        for(int i=1;i<=n-1;i++){
            int key= arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        System.out.println("After sorting :" + Arrays.toString(arr));
    }
}
