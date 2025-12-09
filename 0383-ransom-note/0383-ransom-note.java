class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>mag=new HashMap<>();
        HashMap<Character,Integer>ran=new HashMap<>();

        //counting the frequency of each character of magzine
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            mag.put(ch,mag.getOrDefault(ch,0)+1);
        }

        //counting the frequency of each character of ransomNote
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            ran.put(ch,ran.getOrDefault(ch,0)+1);
        }

        for(char ch:ran.keySet()){
            //this is each character of ransomNote
            if(mag.getOrDefault(ch,0)<ran.get(ch))return false;
        }
        return true;
        
    }
}