// You are given 2 arrays arr1,arr2. You need to check if all elements of arr2 present in arr1. Arrays in sorted order.
//arr1={1,2,3,4}
//arr2={2,3,4}

//Output : True

import java.util.*;
public class Check_Subarray_in_Sorted_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array 1");
        int n1 = sc.nextInt();
        System.out.println("Enter the size of array 2");
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];


        System.out.println("Enter array 1 elements");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter array 2 elements");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean result = findOcc(arr1, arr2);
        System.out.println(result? "true" : "false");


    }

    static boolean findOcc(int[] arr1, int[] arr2) {


        int i = 0, j = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) {
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {

                return false;
            }

        }
        return true;
    }
}

