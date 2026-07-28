class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int partition=n/2;
        char chars[]=s.toCharArray();
        Arrays.sort(chars,0,partition);
        for(int i=0;i<partition;i++){
            chars[n-1-i]=chars[i];
        }
        return new String(chars);
    }
}