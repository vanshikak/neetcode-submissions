class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
        return dfs(n,0,memo);
    }
    public int dfs(int n, int i, int[] memo){
        if(i>=n) return i==n ? 1 : 0;
        if(memo[i] != -1) return memo[i];
        return memo[i] = dfs(n, i+1, memo) + dfs(n,i+2,memo); 
    }
}
