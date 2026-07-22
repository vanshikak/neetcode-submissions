class Solution {
    public int maxArea(int[] heights) {
            int count=0;
            int area = Integer.MIN_VALUE;
            for(int i=0;i<heights.length;i++){
                count=1;
                for(int j=i+1;j<heights.length;j++){
                    area = Math.max(area,count*(Math.min(heights[i],heights[j]))) ;
                    count++;
                }
            }
            return area;
    }
}
