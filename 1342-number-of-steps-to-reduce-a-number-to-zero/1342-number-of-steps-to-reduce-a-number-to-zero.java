class Solution {
    public int numberOfSteps(int num) {
        return solve(num,0);
    }
    private int solve(int num,int c){
        if(num==0)return c;
        if(num%2==0)return solve(num/2,c+1);
        return solve(num-1,c+1);
    }
}