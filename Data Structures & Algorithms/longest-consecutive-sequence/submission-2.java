class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0) return 0;
        Arrays.sort(nums);
        List<Integer> ls = new ArrayList<>();
        List<Integer> size = new ArrayList<>();
        ls.add(nums[0]);
        for(int i=1; i<nums.length;i++){
            if(nums[i]-1==nums[i-1]){
                ls.add(nums[i]);
            }else if(nums[i]==nums[i-1]){
                continue;
            }else{
                size.add(ls.size());
                ls = new ArrayList<>();
                ls.add(nums[i]);
            }
        }
        size.add(ls.size());

        int max=0;
        for(int s : size){
            max = Math.max(max,s);
        }
        return max;
    }
}
