class Solution {
    static int dp[][];
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        dp=new int[n+1][m+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        int lcs=LCS(word1,word2,n,m);
        int extra1=n-lcs;//these did not matched
        int extra2=m-lcs;//these did not matched
        return extra1+extra2;
    }
    private int LCS(String s1,String s2,int n,int m){
        
        if(n==0 || m==0)return 0;
        if(dp[n][m]!=-1) return dp[n][m];
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m] =1+LCS(s1,s2,n-1,m-1);
        }
        return dp[n][m]=Math.max(LCS(s1,s2,n-1,m),LCS(s1,s2,n,m-1));
    }
}