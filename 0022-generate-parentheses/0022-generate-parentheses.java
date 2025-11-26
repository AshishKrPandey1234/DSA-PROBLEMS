class Solution {
    static List<String>ans;
    public List<String> generateParenthesis(int n) {
        ans=new ArrayList<>();
        solve(0,0,n,"");
        return ans;   
    }
    public void solve(int open,int close,int n,String s){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(open<n)solve(open+1,close,n,s+"(");
        if(close<open)solve(open,close+1,n,s+")");
        
    }
}