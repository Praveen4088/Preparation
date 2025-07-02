// Minimum PseudoBinary Sum

//Given a number n, represent it as the sum of the minimum number of pseudobinary numbers

//Input = 31  -------->11+10+10   (3)


public class Minimum_PseudoBinary_Sum {
    public static void main(String[] args) {
        int n= 31;
        int result=findPseudoBinary(n);
        System.out.println(result);
    }

    static int findPseudoBinary(int n){
        int maxDigit=0;

        while(n>0){
            int digit=n%10;
            maxDigit=Math.max(maxDigit,digit);
            n=n/10;
        }
        return maxDigit;
    }
}
