import java.util.Scanner;

public class armstong_number {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int ans=0,rem=0;
        while(n>0){
            rem=n%10;
            int cube=rem*rem*rem;
            ans=ans+cube;
            n=n/10;
        }
        if(temp==ans){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
    }
}
