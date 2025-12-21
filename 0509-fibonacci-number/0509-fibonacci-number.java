//top down : memoization
class Solution {
    private int solve(int dp[],int n){
        if(n<=1)return n;
        if(dp[n]!=-1)return dp[n];
        dp[n]=solve(dp,n-1)+solve(dp,n-2);
        return dp[n];
    }
    public int fib(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(dp,n);
    }
}

//bottom up: tabulation 
// class Solution{
//     public int fib(int n){
//         if(n<=1)return n;
//         int dp[]=new int[n+1];
//         dp[0]=0;
//         dp[1]=1;
//         for(int i=2;i<=n;i++){
//             dp[i]=dp[i-1]+dp[i-2];
//         }
//         return dp[n];
//     }
// }


//space optimization
// class Solution{
//     public int fib(int n){
//         if(n==0)return 0;
//         int a=0;
//         int b=1;
//         int s=0;
//         for(int i=2;i<=n;i++){
//             s=a+b;
//             a=b;
//             b=s;
//         }
//         return b;
//     }
// }