import java.util.HashMap;
import java.util.Map;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Maintain a visited list
        boolean[][] visited = new boolean[image.length][image[0].length];

        return floodFill(image, sr, sc, color, image[sr][sc], visited);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color, int colorToReplace, boolean[][] visited) {

        // Array limitations
        if (sc < 0 || sc >= image[0].length) return image;
        if (sr < 0 || sr >= image.length) return image;

        // check if visited first
        if (visited[sr][sc]) {
            return image;
        } else {
            visited[sr][sc] = true;
        }

        // base case
        if (image[sr][sc] != colorToReplace) {
            return image;
        }

        // if colorToReplace is found
        if (image[sr][sc] == colorToReplace) {
            // Replace this to color
            // System.out.println("replacing");
            image[sr][sc] = color;

        }

        // then go 4 directional
        // visit 4 directions if it's not visited

        // up
        floodFill(image, sr - 1, sc, color, colorToReplace, visited);

        // down
        floodFill(image, sr + 1, sc, color, colorToReplace, visited);

        // left
        floodFill(image, sr, sc - 1, color, colorToReplace, visited);

        // right
        floodFill(image, sr, sc + 1, color, colorToReplace, visited);



        return image;
    }
}
