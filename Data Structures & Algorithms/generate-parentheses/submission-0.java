class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(0,0,n,"",ans);
        return ans;
    }
    public void backtrack(int open, int close, int n, String s, List<String> ans){
        if(open == close && open+close==2*n){
            ans.add(s);
            return;
        }
        if(open < n){
            backtrack(open+1,close,n,s+"(",ans);
        }
        if(close<open){
            backtrack(open,close+1,n,s+")",ans);
        }
    }
}
