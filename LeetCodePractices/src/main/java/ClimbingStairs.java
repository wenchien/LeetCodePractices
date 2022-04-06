import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClimbingStairs {
    public int climbStairs(int n) {
        return climbStairs(n, 0, n, new HashMap<Integer, Integer>());
    }

    public int climbStairs(int n, int ways, int remainder, Map<Integer, Integer> cache) {
        if (cache.containsKey(remainder)) {
            return cache.get(remainder);
        }

        if (remainder == 0) {
            return ++ways;
        }

        if (remainder < 0) {
            cache.put(remainder, ways);
            return ways;
        }
        cache.put(remainder, climbStairs(n, ways, remainder - 1, cache) + climbStairs(n, ways, remainder - 2, cache));
        // ways = climbStairs(n, ways, remainder - 1, cache) + climbStairs(n, ways, remainder - 2, cache);

        return cache.get(remainder);
    }

    public int oldClimbStairs(int n) {
        return oldClimbStairs(n, 0, n);
    }

    public int oldClimbStairs(int n, int ways, int remainder) {
        if (remainder == 0) {
            return ++ways;
        }

        if (remainder < 0) {
            return ways;
        }
        ways = oldClimbStairs(n, ways, remainder - 1) + oldClimbStairs(n, ways, remainder - 2);
        // ways = climbStairs(n, ways, remainder - 1, cache) + climbStairs(n, ways, remainder - 2, cache);

        return ways;
    }



}
