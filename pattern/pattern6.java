//         *
//        * *
//       * * *
//      * * * *
//     * * * * *

package pattern;
import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int row=1;row<=n;row++){
            int totalcolsinrow=row;
            int noofspaces=n-totalcolsinrow;
            for(int s=1;s<=noofspaces;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}