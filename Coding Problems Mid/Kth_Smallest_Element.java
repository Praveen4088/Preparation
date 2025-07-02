// Kth smallest element

// given an unsorted array and a number k, find the kth smallest element withgout modifying array

// input={7,10,4,3,20,15}  k=3     Output:7

import java.util.PriorityQueue;

public class Kth_Smallest_Element {
    public static void main(String[] args) {
        int[] arr={7,10,4,3,20,15};
        int k=3;

        int kthSmallest = findKthSmallest(arr, k);
        System.out.println("Kth smallest element: " + kthSmallest);
    }

    static int findKthSmallest(int arr[],int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for( int num : arr){
            minHeap.add(num);
        }

        for(int i=0;i<k-1;i++){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
