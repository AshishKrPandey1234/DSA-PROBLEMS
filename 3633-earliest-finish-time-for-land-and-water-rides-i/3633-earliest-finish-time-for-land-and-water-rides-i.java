class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n=landStartTime.length;
        int m=waterStartTime.length;
        int ans=Integer.MAX_VALUE;
        //if we start with land
        for(int i=0;i<n;i++){
            int landFinishTime=landStartTime[i]+landDuration[i];
            for(int j=0;j<m;j++){
                int currEnd=landFinishTime;
                if(currEnd>=waterStartTime[j]){
                    currEnd+=waterDuration[j];
                }else{
                    currEnd=waterStartTime[j]+waterDuration[j];
                }
                ans=Math.min(ans,currEnd);
            }
        }
        //if we start with water
        for(int i=0;i<m;i++){
            int waterFinishTime=waterStartTime[i]+waterDuration[i];
            for(int j=0;j<n;j++){
                int currEnd=waterFinishTime;
                if(currEnd>=landStartTime[j]){
                    currEnd+=landDuration[j];
                }else{
                    currEnd=landStartTime[j]+landDuration[j];
                }
                ans=Math.min(ans,currEnd);
            }
        }
        return ans;
        
    }
}