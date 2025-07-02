//Maximum Consecutive Subarray
//Given a binary array (containing only 0s and 1s), find the length of the longest consecutive subarray of the same digit.
// If no such subarray exists, print "No subarray found".
//
//Example Input: [1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1]
//Example Output: 4

public class Max_Consecutive_Subarray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};

        int currentCount=1;
        int maxLen=1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1]){
                currentCount++;
                maxLen=Math.max(maxLen,currentCount);
            }
            else{
                currentCount=1;
            }


        }
        if(maxLen>=2)
            System.out.println(maxLen);
        else
            System.out.println("No sub array found");
    }
}
