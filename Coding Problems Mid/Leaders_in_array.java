// Leaders in array

// You need to print the number which is larger than the previous element.
// Input : {16,17,4,3,5,2}   Output: {17,5,2}

public class Leaders_in_array {
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        int max=0;
        StringBuilder result= new StringBuilder();

        for (int i = arr.length-1;i>=0;i--) {
            if(arr[i]>max){
                result.insert(0,arr[i]+ " ");
                max=arr[i];
            }


        }
        System.out.println(result);
    }
}
