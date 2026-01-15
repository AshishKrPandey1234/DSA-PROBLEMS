class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;//match kara toh i badhega
            }
            //match kare toh i and j badhega
            //warna sirf j abdhega menas j toh badhega hi at any cost
            j++;

            //since length of s string can be<=t.length
        }
        return i==s.length();
    }
}