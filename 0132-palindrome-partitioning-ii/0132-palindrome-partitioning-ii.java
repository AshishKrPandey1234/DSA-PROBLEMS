class Solution {
    private boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    static int dp[];
    private int solve(String s,int i){
        int n=s.length();
        if(i==n || isPalindrome(s,i,n-1)) return 0;
        if(dp[i]!=-1) return dp[i];
        int minCuts=Integer.MAX_VALUE;
        for(int j=i;j<n;j++){
            if(isPalindrome(s,i,j)){
                int cuts=1+solve(s,j+1);
                minCuts=Math.min(cuts,minCuts);
            }
        }
        return dp[i]=minCuts;

    }
    public int minCut(String s) {
        int n=s.length();
        dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(s,0);        
    }
}