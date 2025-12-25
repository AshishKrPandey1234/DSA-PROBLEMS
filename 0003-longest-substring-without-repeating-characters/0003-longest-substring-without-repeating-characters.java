class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            int hash[]=new int[256];
            for(int j=i;j<s.length();j++){
                if(hash[s.charAt(j)]==1) break;
                int len=j-i+1;
                maxLen=Math.max(maxLen,len);
                hash[s.charAt(j)]=1;
            }
        }
        return maxLen;
        
    }
}