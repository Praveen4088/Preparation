import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) {
                flag = 0;
            }
        }
        if(flag==0){
            System.out.println("Not a prime");
        }
        else{
            System.out.println("It is prime");
        }
    }
}
