package searching;

import java.util.Scanner;

public class binay_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements in array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter arrays elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to search");
        int key=sc.nextInt();
        int index=binary_search(arr,key);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
    static int binary_search(int[] arr,int key){
        int left=0;
        int right=arr.length-1;
        if(arr.length<=0){
            return -1;
        }
        else{
            while(left<=right){
                int mid=(left+right)/2;
                if(arr[mid]==key){
                    return mid;
                }
                else if(arr[mid]>key){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        return -1;
    }
}
