class Solution {
    public int minSwaps(int[][] grid) {
        int n=grid.length;
        int TrailingZeroes[]=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=n-1;j>=0;j--){
                if(grid[i][j]==0){
                    count++;
                }else break;
            }
            TrailingZeroes[i]=count;
        }
        int swaps=0;
        for(int i=0;i<n;i++){
            int need=n-i-1;
            int j=i;
            while(j<n && TrailingZeroes[j]<need){
                j++;
            }
            if(j==n)return -1;
            while(j>i){
                int temp=TrailingZeroes[j];
                TrailingZeroes[j]=TrailingZeroes[j-1];
                TrailingZeroes[j-1]=temp;
                swaps++;
                j--;
            }
        }
        return swaps;
    }
}