class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int altitude[]=new int[n+1];
        int max=Integer.MIN_VALUE;
        altitude[0]=0;
        for(int i=1;i<n+1;i++){
            altitude[i]=altitude[i-1]+gain[i-1];
        }
        for(int i=0;i<n+1;i++){
            if(altitude[i]>=max){
                max=altitude[i];
            }
        }
        return max;
    }
}