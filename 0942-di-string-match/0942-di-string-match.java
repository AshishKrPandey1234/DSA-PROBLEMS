class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int lp=0;
        int rp=n;
        int res[]=new int[n+1];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                res[i]=lp;
                lp++;
            }else if(s.charAt(i)=='D'){
                res[i]=rp;
                rp--;
            }
            
        }
        if(s.charAt(n-1)=='I'){
                res[n]=lp;
        }
        else if(s.charAt(n-1)=='D'){
                res[n]=rp;
        }

        return res;
    }
}