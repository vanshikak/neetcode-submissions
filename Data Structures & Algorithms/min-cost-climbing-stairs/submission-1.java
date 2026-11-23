class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] memo = new int[cost.length+1];
        Arrays.fill(memo, -1);
        return Math.min(dfs(cost,0, memo), dfs(cost,1,memo));
    }
    public int dfs(int [] cost, int i, int[] memo){
        if(i >= cost.length) return 0;
        if(memo[i]!=-1) return memo[i];
        return memo[i] = cost[i] + Math.min(dfs(cost, i+1,memo), dfs(cost, i+2,memo));
    }
}
