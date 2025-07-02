//You are given N petrol pumps arranged in a circular manner along a road.
// Each petrol pump provides a certain amount of petrol and is a certain distance away from the next petrol pump.
//
//Each petrol pump is represented as an array element petrol_pump[i], where:
//
//petrol_pump[i][0] = Amount of petrol available at the i-th petrol pump.
//petrol_pump[i][1] = Distance required to travel to the next petrol pump.
//You start with an empty tank and can start the journey from any petrol pump. Your goal is to find the first petrol pump (index)
// from where you can complete the circular tour without running out of petrol.
//
//Input Format
//An integer N (1 ≤ N ≤ 10⁵) representing the number of petrol pumps.
//An N × 2 integer matrix petrol_pump[][], where:
//petrol_pump[i][0] (1 ≤ petrol ≤ 10⁵) represents petrol available at the i-th pump.
//petrol_pump[i][1] (1 ≤ distance ≤ 10⁵) represents the distance to the next pump.
//        Output Format
//Return the index (0-based) of the petrol pump from where the journey can be completed successfully.
//If no such petrol pump exists, return -1.
//Example 1
//Input:
//mathematica
//        Copy
//Edit
//Enter petrol pump count
//4
//Enter Petrol value & distance
//         4 6
//         6 5
//         7 3
//         4 5
//Output:
//        Start = 1 (Index of the 2nd petrol pump)

import java.util.*;
public class Petrol_Pump {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of petrol bunks");
        int n=sc.nextInt();

        int petrol_pump[][] = new int[n][2];

        System.out.println("Enter petrol value and distance");

        for (int i = 0; i < n; i++) {
            petrol_pump[i][0]= sc.nextInt();
            petrol_pump[i][1]=sc.nextInt();
            System.out.println("--------------");

        }

        int result= findStartingIndex(petrol_pump,n);

        System.out.println("Starting "+ result +" (Index of the petrol pump :"+(result+1));
    }

    public static int findStartingIndex( int petrol_pump[][],int n){

        int petrol=0;
        int bal_petrol=0;
        int distance=0;
        int index=0;

        for (int i = 0; i < n; i++) {

            petrol+=petrol_pump[i][0];
            distance+=petrol_pump[i][1];

            bal_petrol+= petrol_pump[i][0] -petrol_pump[i][1];


            if(bal_petrol<0){
                index++;
                bal_petrol=0;
                continue;

            }


        }
        return (petrol>=distance)? index : -1;
    }
}
