import java.util.ArrayList;
import java.util.Scanner;

public class CallTaxiBookingg {

    static ArrayList<Taxi> taxis=new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 1; i <=2; i++) {
            taxis.add(new Taxi(i));
        }
        Scanner sc =new Scanner(System.in);

        boolean loop=true;

        while(loop){
            System.out.println("\n 1. Book Taxi \n 2. Taxi Details \n 3. Exit");
            int n=sc.nextInt();

            switch (n){
                case 1:
                    System.out.println("Enter Customer id");
                    int custId = sc.nextInt();

                    System.out.println("Enter pickup point(A-F)");
                    char from=sc.next().charAt(0);

                    System.out.println("Enter drop point(A-F)");
                    char to=sc.next().charAt(0);

                    System.out.println("Enter time(0-23)");
                    int time= sc.nextInt();

                    bookTaxi(custId,from,to,time);
                    break;

                case 2:
                    for (Taxi taxi : taxis) {
                        taxi.printDetails();
                    }
                    break;

                case 3:

                    loop=false;
                    break;
            }

        }
    }


    static void bookTaxi(int custId, char from, char to, int time){
        Taxi selectedTaxi=null;

        int minDistance= Integer.MAX_VALUE;
        int minEarnings= Integer.MAX_VALUE;

        for(Taxi taxi :taxis){
            if(taxi.freeTime<=time){
                int distance= Math.abs(taxi.currentSpot -from);
                if(distance<minDistance || (distance==minDistance && taxi.totalEarnings<minEarnings )){
                    selectedTaxi=taxi;
                    minDistance=distance;
                    minEarnings= taxi.totalEarnings;

                }
            }
        }

        if (selectedTaxi == null) {
            System.out.println("No taxi can be allotted.");
            return;
        }

        int distance = Math.abs(from - to) * 15;
        int fare = 100;
        if (distance > 5) {
            fare += (distance - 5) * 10;
        }

        selectedTaxi.addBooking(custId, from, to, time, fare);
        System.out.println("Taxi-" + selectedTaxi.id + " is allotted.");

    }
}
