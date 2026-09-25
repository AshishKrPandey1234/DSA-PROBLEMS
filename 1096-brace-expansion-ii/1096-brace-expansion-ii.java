class Solution {
    TreeSet<String> ans = new TreeSet<>();
    public List<String> braceExpansionII(String expression) {
        DFS(expression);
        return new ArrayList<>(ans);
    }

    void DFS(String s) {
        int r = s.indexOf('}');

        //No braces left
        if (r == -1) {
            ans.add(s);
            return;
        }
        int l = s.lastIndexOf('{', r);
        String left = s.substring(0, l);
        String right = s.substring(r + 1);

        String inside = s.substring(l+1,r);
        for (String part : inside.split(",")) {
            DFS(left + part + right);
        }
    }

}