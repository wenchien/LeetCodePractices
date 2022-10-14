import java.util.Arrays;

public class MinPathSum {
    public int minPathSum(int[][] grid) {
        // for each row, replace each grid with it's corresponding cost
        // check up and left and add them to current grid's value as cumulative cost
        // be sure to math.min up and left + current grid value to find minimum path
        int m = grid.length;
        int n = grid[0].length;

        // first calculate cumulative cost for first row
        for (int i = 1; i < n; ++i) {
            grid[0][i] = grid[0][i] + grid[0][i - 1];
        }

        // now calculate second row and onward
        for (int i = 1; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (j - 1 < 0) {
                    // add from above
                    grid[i][j] = grid[i - 1][j] + grid[i][j];
                }
                if (i - 1 >= 0 && j - 1 >= 0) {
                    grid[i][j] = Math.min(grid[i - 1][j] + grid[i][j], grid[i][j] + grid[i][j - 1]);
                }
            }
        }


        // Arrays.stream(grid).flatMapToInt(x -> Arrays.stream(x)).forEach(System.out::print);

        return grid[m - 1][n - 1];
    }
}
