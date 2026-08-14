class Solution {
    public int maximumLengthSubstring(String s) {
       int n=s.length();
       int max=Integer.MIN_VALUE;
       for(int left=0;left<n;left++){
        int count[]=new int[26];
        for(int right=left;right<n;right++){
            int ch=s.charAt(right)-'a';
            count[ch]++;
            if(count[ch]>2) break;
            max=Math.max(max,right-left+1);
        }
       }
       return max; 
    }
}