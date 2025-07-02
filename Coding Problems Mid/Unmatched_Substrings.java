//Unmatched Substrings
//Given two strings of equal length, find and print all the substrings where the characters at the same positions
// in both strings are different. The output should display the mismatched substrings from both strings.
//
//Example Input: schoollifeisusefull, schoollongofuselike
//Example Output:
//ifeis , ongof
//
//full , like

public class Unmatched_Substrings {
    public static void main(String[] args) {
        String str1="schoollifeisusefull";
        String str2="schoollongofuselike";

        findUnmatched(str1,str2);
    }

    private static void findUnmatched(String str1, String str2) {

        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();

        int len=str1.length();

        for(int i=0;i<len;i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                sb1.append(str1.charAt(i));
                sb2.append(str2.charAt(i));
            }
            else{
                if(sb1.length()>0){
                    System.out.println(sb1 +","+ sb2);
                    sb1.setLength(0);
                    sb2.setLength(0);

                }
            }
        }

        if (sb1.length() > 0) {
            System.out.println(sb1 + " , " + sb2);
        }

    }
}
