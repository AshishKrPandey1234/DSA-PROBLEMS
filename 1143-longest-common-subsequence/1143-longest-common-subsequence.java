class Solution {
    private int solve(int dp[][],int m,int n,String text1,String text2){
        if(m<0 || n<0)return 0;
        if(dp[m][n]!=-1)return dp[m][n];
        if(text1.charAt(m)==text2.charAt(n)){
            dp[m][n] = 1+solve(dp,m-1,n-1,text1,text2);
        }
        else{
            dp[m][n]=Math.max(solve(dp,m-1,n,text1,text2),solve(dp,m,n-1,text1,text2));
        }
        return dp[m][n];
         
        
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[1001][1001];
        for(int i=0;i<1001;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(dp,m-1,n-1,text1,text2);
        
    }
}