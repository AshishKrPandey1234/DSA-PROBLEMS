class Solution {
    private int solve(String text1,String text2,int idx1,int idx2,int dp[][]){
        if(idx1<0||idx2<0)return 0;
        if(dp[idx1][idx2]!=-1)return dp[idx1][idx2];
        if(text1.charAt(idx1)==text2.charAt(idx2)){
            return dp[idx1][idx2]=1+solve(text1,text2,idx1-1,idx2-1,dp);
        }
        else{
            return dp[idx1][idx2]= Math.max(solve(text1,text2,idx1-1,idx2,dp),solve(text1,text2,idx1,idx2-1,dp));
        }

    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m][n];
        for(int row[]:dp)Arrays.fill(row,-1);
        return solve(text1,text2,m-1,n-1,dp);
    }
}