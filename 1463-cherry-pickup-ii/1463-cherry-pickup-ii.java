class Solution {
    public int cherryPickup(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][][]=new int[m][n][n];
        for(int j1=0;j1<n;j1++){
            for(int j2=0;j2<n;j2++){
                dp[m-1][j1][j2]=(j1==j2)?grid[m-1][j1]:grid[m-1][j1]+grid[m-1][j2];
            }
        }
        //fill the table by bottom up approach from base case to its initial position
        for(int i=m-2;i>=0;i--){
            for(int j1=0;j1<n;j1++){
                for(int j2=0;j2<n;j2++){
                    int max=(int)(-1e9);
                    int curr=(j1==j2)?grid[i][j1]:grid[i][j1]+grid[i][j2];
                    //try out all the 9 move
                    for(int dj1=-1;dj1<=1;dj1++){
                        for(int dj2=-1;dj2<=1;dj2++){
                            int newj1=j1+dj1;
                            int newj2=j2+dj2;
                            if(newj1>=0 && newj1<n && newj2>=0 && newj2<n){
                                max=Math.max(max,curr+dp[i+1][newj1][newj2]);
                            }
                        }
                    }
                    dp[i][j1][j2]=max;
                }
            }
        }
        return dp[0][0][n-1];//that is robert1 and robert2 starting pos is 0 but ending point of robert2 is 0,n-1
        
    }
}