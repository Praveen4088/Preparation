import java.util.Scanner;

public class string_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.next();
        boolean a=palindrome(str);
        if(a==true){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not a palindrome");
        }
    }



    static boolean palindrome(String str){
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char start=str.charAt(0);
            char end=str.charAt(str.length()-1);
            if(start!=end){
                return false;
            }
            }
        return true;

    }
}
