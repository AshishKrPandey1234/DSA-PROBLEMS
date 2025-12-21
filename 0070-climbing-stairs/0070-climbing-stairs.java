//recursion
// class Solution{
//     public int climbStairs(int n){
//         if(n<=1)return 1;
//         return climbStairs(n-1)+climbStairs(n-2);
//     }
// }

//memorization top down approach
// class Solution{
//     private int solve(int n,int dp[]){
//         if(n<=1)return 1;//that is 0 th step se 0th step jane mai bhi 1 step lagega and 1 se bhi same
//         if(dp[n]!=-1)return dp[n];
//         dp[n]=solve(n-1,dp)+solve(n-2,dp);
//         return dp[n];
//     }

//     public int climbStairs(int n){
//         int dp[]=new int[n+1];
//         Arrays.fill(dp,-1);
//         return solve(n,dp);
//     }
// }

//bottom up Tabulation
class Solution{
    public int climbStairs(int n){
        //if(n<=1)return 1;
        //In Climbing Stairs, since the staircase is assumed to have at least 1 step, there is no chance of index out of bounds. in constraints 1<=n<=45
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}






//bottom up approach
// class Solution{
//     public int climbStairs(int n){
//         int dp[]=new int[n+1];
//         dp[0]=1;
//         dp[1]=1;
//         for(int i=2;i<=n;i++){
//             dp[i]=dp[i-1]+dp[i-2];
//         }
//         return dp[n];

//     }
// }

//space optimization that is using loop
// class Solution{
//     public int climbStairs(int n){
//         int a=1;
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
