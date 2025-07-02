import java.util.ArrayList;

public class duplicates_nums_in_array {
    public static void main(String[] args) {

        int[] arr ={2,7,9,2,5,0,6,7,4};
        ArrayList<Integer> dup_arr=new ArrayList<>();
        int index = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    dup_arr.add(arr[j]);
                }
            }
        }
        System.out.println("Duplicate elements are"+ dup_arr);
    }
}
