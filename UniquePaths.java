public class UniquePaths {

    public int betterUniquePaths(int m, int n) {
        int[] array = new int[n];
        if (m == 1 || n == 1) return 1;
        for(int i = 0; i < n; ++i) array[i] = 1;
        for(int i = 1; i < m; ++i) {
            for(int j = 1; j < n; ++j) {
                array[j] = array[j - 1] + array[j];
            }
        }

        return array[n - 1];
    }


    public int uniquePaths(int m, int n) {

        // create a grid
        int[][] grid = new int[m][n];

        return uniquePaths(0, 0 , grid);
    }

    public int uniquePaths(int currentRowIndex, int currentColumnIndex, int[][] grid) {
        if (currentRowIndex >= grid.length) return 0;
        if (currentColumnIndex >= grid[0].length) return 0;

        // if we reach the destination then return 1 as valid path
        if (currentRowIndex == grid.length - 1 && currentColumnIndex == grid[0].length - 1) return 1;

        // Either go down or right
        return uniquePaths(currentRowIndex + 1, currentColumnIndex, grid) + uniquePaths(currentRowIndex, currentColumnIndex + 1, grid);
    }
}
