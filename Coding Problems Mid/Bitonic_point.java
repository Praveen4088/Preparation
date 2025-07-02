// Bitonic point

// You are given a bitonic array- an array that first increases and then decreases.
// Your task is to find the bitonic point- the maximum element in this array

// input={1,4,5,9,14,6,1}    Output : 14

public class Bitonic_point {
    public static void main(String[] args) {
        int arr[]= {1,4,5,9,14,6,1};

        int result= bitonicPoint(arr);
        System.out.println(result);


    }

    static int bitonicPoint(int[] arr){
        int left=0, right = arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){
                return arr[mid];
            }
            else if(arr[mid-1]>arr[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }

        }
        return -1;

    }
}
