class Solution {
    public int totalFruit(int[] fruits) {
        int l=0, r=0;
        int maxLen=0;
        int n=fruits.length;
        Map<Integer,Integer>mpp=new HashMap<>();
        while(r<n){
            mpp.put(fruits[r],mpp.getOrDefault(fruits[r],0)+1);
            if(mpp.size()>2){
                mpp.put(fruits[l],mpp.get(fruits[l])-1);
                if(mpp.get(fruits[l])==0){
                    mpp.remove(fruits[l]);
                }
                l++;
            }
            if(mpp.size()<=2){
                maxLen=Math.max(maxLen,r-l+1);
            }
            
            r++;
        }
        return maxLen;
    }
}