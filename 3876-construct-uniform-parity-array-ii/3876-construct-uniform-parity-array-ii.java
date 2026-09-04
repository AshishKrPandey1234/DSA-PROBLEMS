class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1[0];
        boolean hasOdd=false;
        for(int v:nums1){
            if(v<n){
                n=v;
            }
            if((v&1)==1) hasOdd=true;
        }
        if((n & 1)==1) return true;

        return !hasOdd;
    }
}