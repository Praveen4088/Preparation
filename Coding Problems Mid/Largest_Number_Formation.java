//Largest Number Formation
//Given an array of non-negative integers, arrange them to form the largest possible number and print it.
//
//Example Input: [8, 7, 1, 9]
//Example Output: 9871

public class Largest_Number_Formation {
    public static void main(String[] args) {
        int arr[]={8,7,1,9};

        int count[]= new int[10];

        StringBuilder sb=new StringBuilder();

        for(int i: arr){
            count[i]++;
        }

        for (int i = 9; i >=0 ; i--) {
            while(count[i]>0){
                sb.append(i);
                count[i]--;
            }
        }
        System.out.println(sb);
    }
}
