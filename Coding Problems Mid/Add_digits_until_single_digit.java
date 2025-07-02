// Add digits until single digit

// Given an integer num, repeatedly add all its digits until the result has only one digit, return that one digit

// Input : 38  ----> 3+8=11   ----->1+1=2

public class Add_digits_until_single_digit
{
    public static void main(String[] args) {
        int n=38;

        int result= addDigit(n);
        System.out.println(result);
    }

    static int addDigit(int n){

        while(n>=10){

            int sum=0;
            while(n>0){
                int digit= n%10;
                sum+=digit;
                n=n/10;
            }
            n=sum;

        }
        return n;
    }
}
