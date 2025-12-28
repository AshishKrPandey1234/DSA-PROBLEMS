class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int n=s.length();
        int lastSeen[]={-1,-1,-1};
        for(int i=0;i<n;i++){
            lastSeen[s.charAt(i)-'a']=i;
            count=count+1+Math.min(lastSeen[0],Math.min(lastSeen[1],lastSeen[2]));
            
        }
        return count;
    }
}