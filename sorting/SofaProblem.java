package sorting;
import java.util.*;

public class SofaProblem {

    static class Position {
        int x1, y1, x2, y2, steps;
        char orientation; // 'H' for horizontal, 'V' for vertical

        Position(int x1, int y1, int x2, int y2, int steps, char orientation) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.steps = steps;
            this.orientation = orientation;
        }
    }

    public static int minStepsToMoveSofa(char[][] grid, int m, int n) {
        int[] start = new int[4], end = new int[4];
        boolean[][][][][] visited = new boolean[m][n][m][n][2]; // Last dimension: 0 - Horizontal, 1 - Vertical
        Queue<Position> queue = new LinkedList<>();

        // Find initial and target positions of the sofa
        boolean startFound = false, endFound = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 's') {
                    if (!startFound) {
                        start[0] = i;
                        start[1] = j;
                        startFound = true;
                    } else {
                        start[2] = i;
                        start[3] = j;
                    }
                } else if (grid[i][j] == 'S') {
                    if (!endFound) {
                        end[0] = i;
                        end[1] = j;
                        endFound = true;
                    } else {
                        end[2] = i;
                        end[3] = j;
                    }
                }
            }
        }

        // Determine initial orientation
        char initialOrientation = (start[0] == start[2]) ? 'H' : 'V';
        queue.add(new Position(start[0], start[1], start[2], start[3], 0, initialOrientation));
        visited[start[0]][start[1]][start[2]][start[3]][initialOrientation == 'H' ? 0 : 1] = true;

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        while (!queue.isEmpty()) {
            Position pos = queue.poll();

            // Check if the sofa has reached the destination
            if ((pos.x1 == end[0] && pos.y1 == end[1] && pos.x2 == end[2] && pos.y2 == end[3]) ||
                    (pos.x1 == end[2] && pos.y1 == end[3] && pos.x2 == end[0] && pos.y2 == end[1])) {
                return pos.steps;
            }

            // Move in all directions
            for (int[] dir : directions) {
                int nx1 = pos.x1 + dir[0], ny1 = pos.y1 + dir[1];
                int nx2 = pos.x2 + dir[0], ny2 = pos.y2 + dir[1];

                if (isValidMove(nx1, ny1, nx2, ny2, grid, m, n) &&
                        !visited[nx1][ny1][nx2][ny2][pos.orientation == 'H' ? 0 : 1]) {
                    queue.add(new Position(nx1, ny1, nx2, ny2, pos.steps + 1, pos.orientation));
                    visited[nx1][ny1][nx2][ny2][pos.orientation == 'H' ? 0 : 1] = true;
                }
            }

            // Rotate the sofa if possible
            if (pos.orientation == 'H' && canRotate(pos.x1, pos.y1, pos.x2, pos.y2, 'V', grid, m, n)) {
                int rx1 = Math.min(pos.x1, pos.x2);
                int ry1 = pos.y1; // Rotation preserves one y-coordinate
                int rx2 = rx1 + 1;
                if (!visited[rx1][ry1][rx2][ry1][1]) {
                    queue.add(new Position(rx1, ry1, rx2, ry1, pos.steps + 1, 'V'));
                    visited[rx1][ry1][rx2][ry1][1] = true;
                }
            } else if (pos.orientation == 'V' && canRotate(pos.x1, pos.y1, pos.x2, pos.y2, 'H', grid, m, n)) {
                int ry1 = Math.min(pos.y1, pos.y2);
                int rx1 = pos.x1; // Rotation preserves one x-coordinate
                int ry2 = ry1 + 1;
                if (!visited[rx1][ry1][rx1][ry2][0]) {
                    queue.add(new Position(rx1, ry1, rx1, ry2, pos.steps + 1, 'H'));
                    visited[rx1][ry1][rx1][ry2][0] = true;
                }
            }
        }

        return -1; // Impossible
    }

    private static boolean isValidMove(int x1, int y1, int x2, int y2, char[][] grid, int m, int n) {
        return x1 >= 0 && x1 < m && y1 >= 0 && y1 < n && x2 >= 0 && x2 < m && y2 >= 0 && y2 < n
                && grid[x1][y1] != 'H' && grid[x2][y2] != 'H';
    }

    private static boolean canRotate(int x1, int y1, int x2, int y2, char newOrientation, char[][] grid, int m, int n) {
        if (newOrientation == 'H') {
            int minY = Math.min(y1, y2), maxY = Math.max(y1, y2);
            return y1 == y2 && minY >= 0 && maxY + 1 < n && grid[x1][minY] != 'H' && grid[x1][maxY + 1] != 'H';
        } else { // 'V'
            int minX = Math.min(x1, x2), maxX = Math.max(x1, x2);
            return x1 == x2 && minX >= 0 && maxX + 1 < m && grid[minX][y1] != 'H' && grid[maxX + 1][y1] != 'H';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(), n = sc.nextInt();
        char[][] grid = new char[m][n];

        for (int i = 0; i < m; i++) {
            String line = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        int result = minStepsToMoveSofa(grid, m, n);
        System.out.println(result == -1 ? "Impossible" : result);
    }
}
