class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        long maxSum = 0;
        int x=0;
        int i=n-1;
        while(k>0 && i>=0){
               
                maxSum += Math.max(0,happiness[i]-x);
                x++;
                k--;
                i--;
            }
            

        
        return maxSum;

    }
}