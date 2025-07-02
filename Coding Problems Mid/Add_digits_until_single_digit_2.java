// Add digits until single digits

// Given an integer num, repeatedly add all its digits until the result has only one digit, return that one digit

// Input : 38  ----> 3+8=11   ----->1+1=2

public class Add_digits_until_single_digit_2 {
    public static void main(String[] args) {
        int n=38;

        int result= addDigit(n);
        System.out.println(result);
    }

    static int addDigit(int n){

        if (n == 0) return 0;

        if(n%9==0){
            return 9;
        }
        return n%9;
    }
}
