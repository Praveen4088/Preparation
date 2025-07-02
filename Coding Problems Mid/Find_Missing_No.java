// Find missing number from 0 to n distinct numbers

// arr={ 1,9,0,2,3,8,4,7,5}   Output: 6

public class Find_Missing_No {
    public static void main(String[] args) {
        int[] arr= { 1,9,0,2,3,8,4,7,5};
        int[] arr1={0,1,2};

        int result= findMissing(arr);
        System.out.println(result);
    }

    static int findMissing(int[] arr){

        int n=arr.length;

        int original= (n*(n+1))/2;

        int sum=0;

        for(int a: arr){
            sum+=a;
        }

        return original-sum;

    }
}
