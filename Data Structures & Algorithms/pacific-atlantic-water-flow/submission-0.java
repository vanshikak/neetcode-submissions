class Solution {
    private int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length, m = heights[0].length;
        boolean[][] pac = new boolean[n][m];
        boolean[][] atl = new boolean[n][m];

        Queue<int[]> pacQ = new LinkedList<>();
        Queue<int[]> atlQ  = new LinkedList<>();

        for(int i=0; i<m; i++){
            pacQ.add(new int[]{0,i});
            atlQ.add(new int[]{n-1,i});
        }
        for(int i=0;i<n;i++){
            pacQ.add(new int[]{i,0});
            atlQ.add(new int[]{i,m-1});
        }
        bfs(pacQ,pac,heights);
        bfs(atlQ,atl,heights);

        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pac[i][j] && atl[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }
    private void bfs(Queue<int[]>q, boolean[][] ocean, int[][] heights){
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            ocean[r][c] = true;
            for(int[] d : directions){
                int nr = r + d[0], nc = c + d[1];
                if(nr>=0 && nr<heights.length && nc>=0 && nc<heights[0].length && !ocean[nr][nc] && heights[nr][nc]>=heights[r][c]){
                    q.add(new int[]{nr,nc});
                }
            }
        }
    }
}
