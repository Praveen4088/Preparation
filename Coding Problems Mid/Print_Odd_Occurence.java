//Given a string, print the characters whose count is odd, maintaining the original order
//
// s="aabbccdc        Output: s2


import java.util.HashMap;

public class Print_Odd_Occurence {
    public static void main(String[] args) {
        String s="aabbccdc";
        System.out.println(findOddChar(s));

    }

    static String findOddChar(String str){
        HashMap<Character, Integer> freq= new HashMap<>();
        StringBuilder result= new StringBuilder();

        for(char ch : str.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        for(char ch: freq.keySet()){
            if(freq.get(ch)%2!=0){
                result.append(ch);
            }
        }
        return result.toString();
    }
}
