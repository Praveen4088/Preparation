public class missing_number_in_array {
    public static void main(String[] args) {
        int arr[] = {5,9,1,4,8,6,2,7};
        int n=arr.length+1;
        int total=(n*(n+1))/2;

        int arraysum=0;

        for(int i=0;i<arr.length;i++){
            arraysum=arraysum+arr[i];
        }
         int b=total-arraysum;
        System.out.println("Missing number is "+ b);

    }
}
