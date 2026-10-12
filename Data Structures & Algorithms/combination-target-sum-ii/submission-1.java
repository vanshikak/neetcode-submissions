class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, target, candidates, current, ans);
        return ans;
        
    }
     public void backtrack(int index, int target, int[] candidates, List<Integer> current,                         List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        int prev = -1;
        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] == prev) continue;
            
        
        if (candidates[index] > target) break;
            
            current.add(candidates[i]);
            backtrack(i + 1, target - candidates[i], candidates, current, ans);
            current.remove(current.size() - 1);
            prev = candidates[i];
        }
    }
}