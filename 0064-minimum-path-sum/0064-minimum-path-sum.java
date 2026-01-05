class Solution {
    private int solve(int grid[][],int i,int j){
        if(i==0 && j==0)return grid[0][0];
        if(i<0 || j<0)return (int) 1e9;
        // We use 1e9 instead of Integer.MAX_VALUE to avoid integer overflow.
// Adding any positive value to Integer.MAX_VALUE causes overflow and wraps to Integer.MIN_VALUE (negative),
// which can break min/max comparisons and produce incorrect results.


        int up=grid[i][j]+solve(grid,i-1,j);
        int left=grid[i][j]+solve(grid,i,j-1);

        return Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        return solve(grid,m-1,n-1);
    }
}