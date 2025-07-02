import java.util.ArrayList;

public class duplicate_string_in_array {
    public static void main(String[] args) {

        String[] arr = {"java", "C", "java", "python"};
        ArrayList<String> dup_arr = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    dup_arr.add(arr[j]);
                }
            }
        }
        System.out.println("Duplicate elements are" + dup_arr);
    }
}
