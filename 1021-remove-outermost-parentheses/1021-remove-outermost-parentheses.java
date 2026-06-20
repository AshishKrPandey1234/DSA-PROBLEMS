class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int depth=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(depth>0){
                    sb.append(s.charAt(i));
                }
                depth++;
            }else{
                depth--;
                if(depth>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}