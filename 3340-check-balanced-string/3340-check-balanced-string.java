class Solution {
    public boolean isBalanced(String num) {
        int s1=0;
        int s2=0;
        for(int i=0;i<num.length();i+=2){
            s1+=num.charAt(i)-'0';
        }
        for(int i=1;i<num.length();i+=2){
            s2+=num.charAt(i)-'0';
        }
        if(s1==s2)return true;
        return false;
    }
}