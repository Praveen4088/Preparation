package pattern;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int row=0;row<2*n;row++){
            int noofcolsinrow= row>=n?row-n:n-row;
            for(int col=0;col<noofcolsinrow;col++){
                System.out.print("*");
            }
            int noofspaces=row>n?2*row-1:2*row;
            for(int s=0;s<noofspaces;s++){
                System.out.print(" ");
            }
            for(int col=0;col<noofcolsinrow;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
