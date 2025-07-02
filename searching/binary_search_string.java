package searching;

import java.util.Scanner;

public class binary_search_string {
    public static void main(String[] args) {
        String[] str={"abc","efg","hij","lmn","opq"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string to search");
        String key=sc.next();
        int index=binary(str,key);
        if(index!=-1){
            System.out.println("Element found at index :"+ index);
        }
        else{
            System.out.println("Element not found");
        }
    }
    static int binary(String[] arr,String key){
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            int result=(arr[mid].compareTo(key));
            if(result==0){
                return mid;
            }
            else if(result>0){

                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
}
