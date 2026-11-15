class Solution {
    public int numOfSubarrays(int[] arr) {
        long prefixSum=0;
        long evenCount=1;//as 0 is even number
        long oddCount=0;
        long totalOddCount=0;
        long Mod=1000000007;
        for(int num:arr){
            prefixSum+=num;
            if(prefixSum%2==0){
                totalOddCount+=oddCount;
                evenCount++;
            }else{
                totalOddCount+=evenCount;
                oddCount++;
            }
            totalOddCount%=Mod;
        }
        return (int)totalOddCount;
    }
}