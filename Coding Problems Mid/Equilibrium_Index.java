//An equilibrium index is an array is am index i such that
//the sum of elements before i is equal to the sum of elements after i
//
//arr1={3,4,9,6,1}     Output: Index 2

public class Equilibrium_Index {
    public static void main(String[] args) {
        int[] arr = {3, 4, 9, 6, 1};
        int index = findEquilibrium(arr);
        if(index!=-1){
            System.out.println("Equilibrium index is "+ index);
        }
        else{
            System.out.println("Equilibrium index not found");
        }

    }
    static int findEquilibrium(int arr[]){
        int totalSum=0, leftsum=0;
        for(int i=0;i<arr.length;i++){
           totalSum +=arr[i];
        }

        for (int i = 0; i < arr.length; i++) {

            totalSum-= arr[i];

            if(totalSum==leftsum){
                return i;
            }

            leftsum+=arr[i];

        }
        return -1;

    }
}
