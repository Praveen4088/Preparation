import java.util.ArrayList;
import java.util.List;

public class Taxi {

    int id;
    char currentSpot;
    int freeTime;
    int totalEarnings;
    List<String> trips;

    Taxi(int id){
        this.id=id;
        this.currentSpot='A';
        this.freeTime=0;
        this.totalEarnings=0;
        this.trips= new ArrayList<>();
    }

    void addBooking(int custId,char from,char to,int time,int fare){
        trips.add(custId+ "           "+ from + "     "+ to + "    " + time +"       "+ (time +Math.abs(to - from)) +"    " + fare);
        freeTime = time + Math.abs(to - from);
        currentSpot = to;
        totalEarnings += fare;
    }

    void printDetails() {
        System.out.println("Taxi-" + id + " Total Earnings: Rs. " + totalEarnings);
        System.out.println("BookingID  CustomerID  From  To  PickupTime  DropTime  Amount");
        int bookingId = 1;
        for (String trip : trips) {
            System.out.println(bookingId++ + "          " + trip);
        }
        System.out.println();
    }


}
