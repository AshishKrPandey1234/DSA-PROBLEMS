class Solution {
    public boolean isAnagram(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        if(len1!=len2) return false;
        HashMap<Character,Integer>mpp=new HashMap<>();
        for(int i=0;i<len1;i++){
            char ch=s.charAt(i);
            if(!mpp.containsKey(ch)){
                mpp.put(ch,1);
            }else{
                mpp.put(ch,mpp.get(ch)+1);
            }
        }
        for(int i=0;i<len2;i++){
            char ch=t.charAt(i);
            if(!mpp.containsKey(ch)) return false;
            int count=mpp.get(ch);
            if(count==1) mpp.remove(ch);
            else{
                mpp.put(ch,mpp.get(ch)-1);
            }
        }
        return mpp.isEmpty();
    }
}