package searching;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        int nums[]={3,76,90,67,56,9};
        System.out.println("Enter the number to search");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int ans=linearsearch(nums,target);
        if(ans==-1){
            System.out.println("Element is not found");
        }
        else{
            System.out.println("The element is found at index:"+ans);
        }

    }

    static int linearsearch(int[] arr, int key) {
        if (arr.length == 0) {
            return -1;
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key)
                    return i;
            }
        }
        return -1;
    }
}

