class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int ans[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            ans[i]=grid[i].clone();
        }
        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                ans[x+(k-1-i)%k][y+j]=grid[x+i][y+j];
            }
        }
        return ans;
    }
}