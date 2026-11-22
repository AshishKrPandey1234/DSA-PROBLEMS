class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        int lasta=-1;
        int firstb=n;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a'){
                lasta=Math.max(lasta,i);
            }else{
                firstb=Math.min(firstb,i);
            }
        }
        return lasta<firstb;
    }
}