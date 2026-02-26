class Solution {
    private void dfs(int r,int c,char board[][],int vis[][]){
        int n=board.length;
        int m=board[0].length;
        vis[r][c]=1;
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        for(int k=0;k<4;k++){
            int newRow=r+dr[k];
            int newCol=c+dc[k];
            if(newRow>=0 && newRow<n && newCol>=0 && newCol<m && vis[newRow][newCol]==0 && board[newRow][newCol]=='O'){
                dfs(newRow,newCol,board,vis);
            }
        }
    }
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int vis[][]=new int[n][m];

        //traverse in the first and last row
        for(int j=0;j<m;j++){
            if(board[0][j]=='O' && vis[0][j]==0) dfs(0,j,board,vis);
            if(board[n-1][j]=='O' && vis[n-1][j]==0) dfs(n-1,j,board,vis);
        }

        //traverse in the first and last column
        for(int i=0;i<n;i++){
            if(board[i][0]=='O' && vis[i][0]==0)dfs(i,0,board,vis);
            if(board[i][m-1]=='O' && vis[i][m-1]==0)dfs(i,m-1,board,vis);
        }

        //for all unvisited 0 which is surrounded by X
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O' && vis[i][j]==0){
                    board[i][j]='X';
                }
            }
        }
        
    }
}