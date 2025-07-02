//Print the number of vowels present in the given string

public class Count_Vowels {
    public static void main(String[] args) {

        String vowels = "aeiou";
        String s = "Oello";

        String str = s.toLowerCase();
        int count=0;

        for (int i = 0; i < str.length(); i++) {

            for(int j=0;j<vowels.length();j++){
                if(str.charAt(i)==vowels.charAt(j)){
                    count++;
                }
            }
        }

        if(count==0){
            System.out.println("No vowels");
        }
        else{
            System.out.println(count);
        }
    }
}
