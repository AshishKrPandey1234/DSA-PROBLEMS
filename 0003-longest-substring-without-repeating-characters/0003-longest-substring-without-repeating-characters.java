class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        int maxlen=0;
        int n=s.length();
        int hash[]=new int[256];
        Arrays.fill(hash,-1);
        while(r<n){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>=l){
                    l=hash[s.charAt(r)]+1;
                }
            }
            int len=r-l+1;
            maxlen=Math.max(len,maxlen);
            hash[s.charAt(r)]=r;
            r++;
            
        }
        
        return maxlen;
        
    }

}