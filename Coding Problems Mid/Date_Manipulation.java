//Date Manipulation (Add Days to Date)
//Given a date in DD-MM-YYYY format and an integer N, write a program to add N days to the given date and print the new date in the same format. The solution must account for leap years and varying month lengths.
//
//Example Input: 31-12-2025, N = 3000
//Example Output: 26-11-2034

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_Manipulation {
    public static void main(String[] args) {

        String Date= "31-12-2025";
        int n= 3000;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date = LocalDate.parse(Date, format);

        LocalDate newDate= date.plusDays(n);

        System.out.println(newDate.format(format));
    }
}
