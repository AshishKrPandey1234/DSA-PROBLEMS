class Solution {
    public double myPow(double x, int n) {
        return solve(x,n,res);
    }
    public double solve(double x,int n, double res){
        if(n==1)return x;
        if(n==-1)return 1/x;
        if(n%2==0)return solve(x,n/2,Math.pow(x,n/2)*Math.pow(x,n/2));
        return solve(x,n/2,Math.pow(x,n/2+1)*Math.pow(x,n/2));

    }

}