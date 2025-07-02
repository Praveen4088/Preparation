import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int t1=0,t=0,t2=1;
        int count=2;
        System.out.println("Enter n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(count<=n){
            t=t1+t2;
            t1=t2;
            t2=t;
            count++;
        }
        System.out.print(t);


    }
}
