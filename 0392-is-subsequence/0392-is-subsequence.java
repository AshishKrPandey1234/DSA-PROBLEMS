class Solution {
    Boolean dp[][];
    private boolean solve(int i,int j,String s,String t){
        if(i==s.length())return true;
        if(j==t.length())return false;
        if(dp[i][j]!=null)return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            dp[i][j]=solve(i+1,j+1,s,t);
        }else{
            dp[i][j]=solve(i,j+1,s,t);
        }
        return dp[i][j];
    }
    public boolean isSubsequence(String s, String t) {
        dp=new Boolean[s.length()+1][t.length()+1];
        return solve(0,0,s,t);
    }
}