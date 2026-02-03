class Solution {
    public int findCenter(int[][] edges) {
        int p1=edges[0][0];
        int p2=edges[0][1];
        if(p1==edges[1][0]|| p1==edges[1][1])return p1;
        return p2;
        
    }
}