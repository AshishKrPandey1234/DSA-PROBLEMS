class Solution {
    public boolean canBeEqual(String s1, String s2) {
        //if(s1.length()!=s2.length())return false; this is not needed as it is mention in constraints
        if(s1.equals(s2))return true;
        for(int i=0;i<4;i++){
            if(s1.charAt(0)==s2.charAt(2) && s1.charAt(2)==s2.charAt(0) && 
                s1.charAt(1)==s2.charAt(1) && s1.charAt(3)==s2.charAt(3))return true;
            if(s1.charAt(0)==s2.charAt(2) && s1.charAt(2)==s2.charAt(0) && 
                s1.charAt(1)==s2.charAt(3) && s1.charAt(3)==s2.charAt(1))return true;
            if(s1.charAt(0)==s2.charAt(0) && s1.charAt(2)==s2.charAt(2) && 
                s1.charAt(1)==s2.charAt(3) && s1.charAt(3)==s2.charAt(1))return true;
        }
        return false;
        
    }
}