class Solution {
    static int dp[][];
    public int minCost(int n, int[] cuts) {
        int len=cuts.length;
        int newCuts[]=new int[len+2];
        newCuts[len]=0;
        newCuts[len+1]=n;
        for(int i=0;i<len;i++){
            newCuts[i+1]=cuts[i];
        }
        dp=new int[len+2][len+2];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        Arrays.sort(newCuts);
        return solve(1,len,newCuts);
    }
    private int solve(int i,int j, int newCuts[]){
        if(i>j) return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            int steps=newCuts[j+1]-newCuts[i-1]+solve(i,k-1,newCuts)+solve(k+1,j,newCuts);
            min=Math.min(min,steps);
        }
        return dp[i][j]=min;
    }
}