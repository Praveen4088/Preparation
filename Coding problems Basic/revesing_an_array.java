import java.util.Arrays;
import java.util.Scanner;

public class revesing_an_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements in array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter arrays eleements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Actual array "+ Arrays.toString(arr));
        reverse(arr);
        System.out.println("After reversing "+ Arrays.toString(arr));
    }
    static long[] reverse(int[] arr){
        int start=0, end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        return null;
    }

    static void swap(int[] arr,int start,int end){
       int temp=arr[start];
       arr[start]=arr[end];
       arr[end]=temp;
    }
}
