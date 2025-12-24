class Solution {
    private int solve(int i,int j,String s,int dp[][]){
        if(i>=j)return 0;
        if(dp[i][j]!=-1)return dp[i][j]; 
        if(s.charAt(i)==s.charAt(j))return dp[i][j]= solve(i+1,j-1,s,dp);
        else return dp[i][j]=Math.min(1+solve(i+1,j,s,dp),1+solve(i,j-1,s,dp));

    }
    public int minInsertions(String s) {
        int n=s.length();
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,n-1,s,dp);
    }
}