class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0; j<m; j++){
                if(board[i][j]==word.charAt(0)){
                    if(backtrack(0,i,j,word,board)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean backtrack(int index, int i, int j, String word, char[][] board){
        if(index==word.length()){
            return true;
        }
        // Boundary conditions and character mismatch check
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(index) != board[i][j]) {
            return false;
        }
 
        // Temporarily mark the cell as visited
        char temp = board[i][j];
        board[i][j] = ' ';
        boolean ans = backtrack(index+1,i-1,j,word,board) ||
                      backtrack(index+1,i+1,j,word,board) ||
                      backtrack(index+1,i,j-1,word,board) ||
                      backtrack(index+1,i,j+1,word,board);

        board[i][j] = temp;
        return ans;
    }
}
