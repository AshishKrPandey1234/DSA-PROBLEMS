class Solution {
    public String minWindow(String s, String t) {
        int m=t.length();
        int n=s.length();
        int freq[]=new int[256];
        int l=0,r=0,minLen=Integer.MAX_VALUE;
        int sIdx=-1;
        //initialising the frequency of text in freq array
        for(int i=0;i<m;i++){
            freq[t.charAt(i)]++;
        }
        int count=0;
        while(r<n){
            if(freq[s.charAt(r)]>0){
                count=count+1;//since freq>0 for s.charAt(r) it means in text it must be ther becuase till now only text is inside the freqarray
            }
            freq[s.charAt(r)]--;//once count is calculated now freq will be decreased since it is already compared with thta character
            while(count==m){
                if(r-l+1<minLen){
                    minLen=r-l+1;
                    sIndex=l;
                }
                freq[s.charAt(l)]--;
            }

            if(freq[s.charAt(l)]>0){//it means not present in the text
            count=count-1;
            }
            r=r-1;
        }
        return sIdx==-1?"":s.subString(sIdx,minLen);
        
    }
}