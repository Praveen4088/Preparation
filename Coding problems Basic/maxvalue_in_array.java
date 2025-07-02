import java.util.Scanner;
public class maxvalue_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements in array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter arrays eleements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=maxvalue(arr);
        System.out.println("Max value is "+ans);
    }
    static int maxvalue(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
