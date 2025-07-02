//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

package pattern;
import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int row=1;row<=2*n;row++){
            int totalcolsinrow= row>n?2*n-row:row;
            for(int col=1;col<=totalcolsinrow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}