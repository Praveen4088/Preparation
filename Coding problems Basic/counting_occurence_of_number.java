import java.util.Scanner;

public class counting_occurence_of_number {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter number to count occurence");
        int m=sc.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==m){
                count++;
            }
            n=n/10;
        }
        System.out.println("The number " + m + " occurs " +count +" times");
    }
}
