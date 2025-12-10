class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        int cnt=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' ') cnt++;
            else break;
        }
        return cnt;
    }
}