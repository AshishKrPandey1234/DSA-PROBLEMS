class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int l=0,r=0,n=s.length();
        int maxFreq=0;
        int maxLen=0;
        while(r<n){
            freq[s.charAt(r)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(r)-'A']);
            int currentLen=r-l+1;
            if(currentLen-maxFreq>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            else if(currentLen-maxFreq<=k){
                currentLen=r-l+1;
                maxLen=Math.max(maxLen,currentLen);
            }
            r++;
        }
        return maxLen;
    }
}



//brute force
// class Solution {
//     public int characterReplacement(String s, int k) {
//         int n=s.length();
//         int maxLen=0;
//         for(int l=0;l<n;l++){
//             int freq[]=new int[26];
//             int maxFreq=0;
//             for(int r=l;r<n;r++){
//                 freq[s.charAt(r)-'A']++;
//                 maxFreq=Math.max(maxFreq,freq[s.charAt(r)-'A']);
//                 int currentLen=r-l+1;
//                 if(currentLen-maxFreq<=k){
//                     //currentLen=r-l+1;
//                     maxLen=Math.max(maxLen,currentLen);
//                 }
//                 else break;
//             }
//         }
//         return maxLen;
//     }
// }