// Write a program to give the following output for the given input

// Eg. Input : a1b10
//Output : abbbbbbbbbb

// Eg. Input : b3c6d15
//Output : bbbccccccddddddddddddddd

public class Print_Letter {
    public static void main(String[] args) {

        String input="a10b5c3";

        String output="";

        for (int i = 0; i < input.length(); i++) {
            char ch= input.charAt(i);

            if(Character.isLetter(ch)){
                String num= "";
                int j=i+1;

                while (j < input.length() && Character.isDigit(input.charAt(j))){
                    num+= input.charAt(j);
                    j++;
                }

                int count = Integer.parseInt(num);

                for (int k = 0; k < count ; k++) {
                    output+=ch;

                }
                i=j-1;

            }
        }
        System.out.println("Output:\n" + output);



    }
}
