// First Non repeating Character in a String

// If no such character exists, return -1.
// The comparison is Case sensitive
// Special characters and symbols are also counted.

public class First_Non_repeating_Character {
    public static void main(String[] args) {

        String str= "abcdabd";
        System.out.println(findFirst(str));

    }

    static Character findFirst(String str){
        if(str.length()<=1)
            return null;

        int count[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if(count[str.charAt(i)]==1){
                return str.charAt(i);
            }
        }
        return null;
    }
}
