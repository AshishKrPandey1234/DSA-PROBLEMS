class Solution {
    public int maxProduct(int n) {
        return solve(n,0,1);
    }
    private int solve(int n, int count, int prod){
        if(n==0) return count==2?prod:0;
        int digit=n%10;
        int take=solve(n/10,count+1, prod*digit);
        int notTake=solve(n/10,count,prod);
        int max= Math.max(take,notTake); 
        return max;
    }
}