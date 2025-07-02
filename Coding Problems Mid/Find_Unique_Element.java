// Given an array where every element appears twice, except one element which appears only once..

// input= {4,5,2,5,4}

import java.util.HashMap;

public class Find_Unique_Element {
    public static void main(String[] args) {
        int[] arr={4,5,2,5,3,4};

        System.out.println(findUnique(arr));
    }

    static int findUnique(int arr[]){

        HashMap<Integer, Integer> freq= new HashMap<>();

        for(int a : arr){
            freq.put(a, freq.getOrDefault(a,0)+1);
        }

        for(int n : freq.keySet()){
            if(freq.get(n)==1){
                return n;
            }
        }
        return -1;
    }
}
