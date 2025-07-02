

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of matrices
        int N = sc.nextInt();
        // Read dimensions of each matrix (rows x columns)
        int r = sc.nextInt();
        int c = sc.nextInt();

        // Read all matrices as a single block of data
        int[][][] matrices = new int[N][r][c];

        // Read matrix data in a single block, row by row
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < N * c; j++) {
                matrices[j / c][i][j % c] = sc.nextInt();
            }
        }

        // Consume the remaining newline character
        sc.nextLine();

        // Read instructions (which matrices to print)
        List<List<Integer>> instructions = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break; // Break on an empty line
            String[] parts = line.split("\\s+");
            List<Integer> instruction = new ArrayList<>();
            for (String part : parts) {
                instruction.add(Integer.parseInt(part));
            }
            instructions.add(instruction);
        }

        // StringBuilder to accumulate the output
        StringBuilder output = new StringBuilder();

        // Process each instruction and format the output
        for (List<Integer> instruction : instructions) {
            for (int matrixIndex : instruction) {
                int[][] matrix = matrices[matrixIndex - 1]; // Convert 1-based to 0-based indexing
                for (int[] row : matrix) {
                    for (int val : row) {
                        output.append(val).append(" ");
                    }
                }
            }
            output.append("\n");
        }

        // Print the final output without extra trailing space
        System.out.print(output.toString().trim());
    }
}
