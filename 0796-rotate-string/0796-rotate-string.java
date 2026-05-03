class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        int m=goal.length();
        if(n!=m)return false;
        for(int i=0;i<n;i++){
            boolean isMatch=true;
            for(int j=0;j<n;j++){
                if(s.charAt(j)!=goal.charAt((i+j)%n)){
                    isMatch=false;
                    break;
                }
            }
            if(isMatch)return true;
        }
        return false;
        
    }
}