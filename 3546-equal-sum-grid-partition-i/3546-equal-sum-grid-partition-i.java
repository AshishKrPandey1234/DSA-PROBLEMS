class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long totalSum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                totalSum+=grid[i][j];
            }
        }
        //if it is not even than how one will divide in two equal half
        if(totalSum%2==1)return false;

        long currRowSum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                currRowSum+=grid[i][j];//pura ek row add ho jaye tab jakar check hoga ki kya bhai partion hone like hai ki nahi
            }
            if(currRowSum*2==totalSum)return true;
        }
        long currColSum=0;
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                currColSum+=grid[i][j];
            }
            if(currColSum*2==totalSum)return true;
        }
        return false;
    }
}