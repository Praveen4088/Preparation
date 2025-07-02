//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *

package pattern;
import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int row=1;row<=2*n;row++){
            int totalcolsinrow= row>n?2*n-row:row;
            int noofspaces=n-totalcolsinrow;
            for(int s=1;s<=noofspaces;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=totalcolsinrow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}