import java.util.Arrays;
import java.util.Scanner;

public class swapping_numbers_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array");
        int n=sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter arrays eleements");

        for (int i = 0; i <n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Before swapping : " + Arrays.toString(arr1));
        swap(arr1, 1, 3);
        System.out.println("After swapping : " + Arrays.toString(arr1));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
