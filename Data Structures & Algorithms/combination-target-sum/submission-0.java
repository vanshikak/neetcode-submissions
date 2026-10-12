class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(0, target,nums,current,ans);
        return ans;
    }
    public void backtrack(int index, int target, int [] nums, List<Integer> current, List<List<Integer>> ans){
        if(index==nums.length){
            if(target==0){
                ans.add(new ArrayList<>(current));
            }
            return;
        } 

        if(nums[index] <= target){
            current.add(nums[index]);
            backtrack(index,target-nums[index],nums,current,ans);
            current.remove(current.size()-1);
        }

        backtrack(index+1,target,nums,current,ans);
    }
}
