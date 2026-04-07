class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        Map<Character,Integer>lastPos=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(lastPos.containsKey(ch)){
                int prevIndex=lastPos.get(ch);

                int currIndex=sb.length();
                if(currIndex-prevIndex<=k)
                    //merge and skip the character
                    continue;
            }
            lastPos.put(ch,sb.length());
            sb.append(ch);
        }
        return sb.toString();
        
        
    }
}