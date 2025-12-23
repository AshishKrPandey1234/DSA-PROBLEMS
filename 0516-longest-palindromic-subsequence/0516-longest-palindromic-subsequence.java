class Solution {


    public int solve(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<=n;j++){
            dp[0][j]=0;
        }
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }

        }
        return dp[m][n];
    }

    public int longestPalindromeSubseq(String s) {
        String r=new StringBuilder(s).reverse().toString();
        return solve(s,r);
    
        // for(int i=0;i<text2.length();i++){
        //     for(int j=0;j<text1.length();j++){
        //         if(text1.charAt(j)==text2.charAt(i)) 
        //         c++;
        //     }
        // }
        // return c;
        
    }
}