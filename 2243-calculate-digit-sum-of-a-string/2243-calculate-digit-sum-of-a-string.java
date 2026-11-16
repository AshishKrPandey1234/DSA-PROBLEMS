class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            StringBuilder sb=new StringBuilder();
            int n=s.length();
            for(int i=0;i<n;i+=k){
                int val=0;
                for(int j=i;j<Math.min(i+k,n);j++){
                    val+=s.charAt(j)-'0';
                }
                sb.append(val);
            }
            s=sb.toString();
        }
        return s;
    }
}