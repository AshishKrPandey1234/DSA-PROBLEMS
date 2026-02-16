class Solution {
    private void dfs(char vis[][],int i,int j){
        int n=vis.length;
        int m=vis[0].length;
        if(i<0 || i>=n || j<0 || j>=m || vis[i][j]!='1')return;
        vis[i][j]='0';
        dfs(vis,i+1,j);
        dfs(vis,i-1,j);
        dfs(vis,i,j+1);
        dfs(vis,i,j-1);
    }
    public int numIslands(char[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int count=0;
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(grid[r][c]=='1'){
                    count++;
                    dfs(grid,r,c);

                }
            }
        }
        return count;
        
    }
}