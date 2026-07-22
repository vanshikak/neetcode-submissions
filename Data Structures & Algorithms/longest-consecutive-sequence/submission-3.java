class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int num : nums){
            st.add(num);
        }
        int longest = 0;
        for(int n : st){
            if(!st.contains(n-1)){
                int length = 1;
                while(st.contains(n+length)){
                    length++;
                }
                longest = Math.max(length,longest);
            }
        }
        return longest;
    }
}
