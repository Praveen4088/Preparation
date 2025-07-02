import java.util.Scanner;

public class reversee_a_number {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans*10+rem;
            n=n/10;
        }
        System.out.println(ans);
    }
}
