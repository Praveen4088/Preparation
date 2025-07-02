import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num 1");
        int a=sc.nextInt();
        System.out.println("Enter num 2");
        int b=sc.nextInt();

        System.out.println("Before swapping: " + a+ " and "+ b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: " + a+ " and "+ b);


    }
}
