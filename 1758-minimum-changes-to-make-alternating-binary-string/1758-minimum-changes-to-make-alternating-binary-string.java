class Solution {
    public int minOperations(String s) {
        int start0=0;//01010101010101....
        int start1=0;//10101010101010....
        for(int i=0;i<s.length();i++){
            if(i%2==0){//even index
                if(s.charAt(i)=='0')start0++;
                else if(s.charAt(i)=='1')start1++;
            }
            else if(i%2==1){
                if(s.charAt(i)=='0')start1++;
                else if(s.charAt(i)=='1')start0++;
            }
        }
        return Math.min(start0,start1);
        
    }
}