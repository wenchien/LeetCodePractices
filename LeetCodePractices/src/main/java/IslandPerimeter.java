public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int islandCount = 0;
        int neighbourCount = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == 1) {
                    islandCount++;
                    if(j + 1 < grid[0].length && grid[i][j + 1] == 1) neighbourCount++;
                    if(i + 1 < grid.length && grid[i + 1][j] == 1) neighbourCount++;
                    // check right and down if island then ++ neighbour count
                }
            }
        }

        return (islandCount * 4) - (neighbourCount * 2);
    }
}
