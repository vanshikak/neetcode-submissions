class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            int ans = 0;
           for(int j=i+1;j<n;j++){ans++;
            if(temperatures[i] <temperatures[j]){
                res[i] = ans;
                break;
            }
           } 
        }
        return res;
    }
}
