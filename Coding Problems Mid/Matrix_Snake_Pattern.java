//Snake Pattern Matrix Traversal
//Given a 2D square matrix, print its elements in snake pattern: first row left to right, second row right to left, and so on.
//
//Example Input:
//[[1, 2, 3],
//[4, 5, 6],
//[7, 8, 9]]
//Example Output:
//1 2 3
//6 5 4
//7 8 9

public class Matrix_Snake_Pattern {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int len= matrix.length;

        for (int i = 0; i < len; i++) {

            if(i%2==0){
                for(int j=0;j< len;j++) {
                    System.out.print(matrix[i][j]);
                }
            }
            else{
                for(int j=len-1; j>=0; j--){
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();

        }
    }
}
