public class MinCostClimbingStairs {

//    public int minCostClimbingStairs(int[] cost) {
//        for (int i = 2; i < cost.length; i ++) {
//            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
//        }
//        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
//    }

    public int minCostClimbingStairs(int[] cost) {
        return Math.min(minCostClimbingStairs(cost, 0, 0), minCostClimbingStairs(cost, 0, 1));
    }

    public int minCostClimbingStairs(int[] cost, int cumulatedCost, int currentIndex) {
        if (currentIndex >= cost.length) {
            return cumulatedCost;
        }

        cumulatedCost = cumulatedCost + cost[currentIndex];
        System.out.println("Current Index: " + currentIndex + " CumulatedCost: " + cumulatedCost);
        return Math.min(minCostClimbingStairs(cost, cumulatedCost, currentIndex + 1), minCostClimbingStairs(cost, cumulatedCost, currentIndex + 2));
    }

}
