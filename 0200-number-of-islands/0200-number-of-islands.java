class Solution {
    public int numIslands(char[][] grid) {
        int isLand=0;
        int rows=grid.length;
        int cols=grid[0].length;
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(grid[r][c]=='1')isLand++;
                dfs(grid,r,c);
            }
        }
        return isLand;
    }
    public void dfs(char[][]vis,int i,int j){
        if(i<0||i>=vis.length||j<0||j>=vis[0].length|| vis[i][j]!='1'){
            return;
        }
        vis[i][j]='0';//visited
        dfs(vis,i+1,j);//down
        dfs(vis,i-1,j);//up
        dfs(vis,i,j+1);//right
        dfs(vis,i,j-1);//left

    }
}