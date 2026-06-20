class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int lo=1;
        int hi=-(int)1e9+7;
        for(int i=0;i<n;i++){
            if(piles[i]>hi) hi=piles[i];
        }
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            long hours=0;
            for(int pile: piles){
                hours+=Math.ceil((double)pile/mid);
            }
            if(hours<=h){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return lo;
    }
}