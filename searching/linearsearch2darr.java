package searching;

import java.util.Arrays;
import java.util.Scanner;

public class linearsearch2darr {
    public static void main(String[] args) {
        int nums[][]={{3,76},
                      {90,67}};
        System.out.println("Enter the number to search");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int ans[] = linearsearch(nums,target);
        int i = -1;
        System.out.println("The element is found at index:"+ Arrays.toString(ans));
        }
    static int[] linearsearch(int[][] arr, int key) {
        if (arr.length == 0) {
            return new int[]{-1};
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                for(int j=0;j<= arr.length;j++) {
                    if (arr[i][j] == key)
                        return new int[]{i,j};

                }
            }
        }
        return new int[]{-1};
    }
}

