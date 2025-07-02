//print from Largest number from an array of digits

//arr={8,7,1,1,9}      Output :   98711

public class Largest_number_from_array_of_digits
{
    public static void main(String[] args) {
        int[] arr={8,7,1,1,9};


        StringBuilder result = new StringBuilder();

        int[] count= new int[10];

        for(int num : arr){
            count[num]++;
        }

        for(int i=9;i>=0;i--){
            while(count[i]>0){
                result.append(i);
                count[i]--;
            }
        }
        System.out.println(result);
    }
}
