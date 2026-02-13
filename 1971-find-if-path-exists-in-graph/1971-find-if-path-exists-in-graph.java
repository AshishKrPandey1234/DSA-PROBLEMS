class Solution {
    private boolean dfs(int n,List<List<Integer>>adj,int curr,int destination,boolean vis[]){
        vis[curr]=true;
        if(curr==destination)return true;
        for(int nbr:adj.get(curr)){
            if(!vis[nbr]){
                boolean found=dfs(n,adj,nbr,destination,vis);
                if(found)return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //Step 1: Create adjacency list
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean vis[]=new boolean[n+1];
        boolean found=dfs(n,adj,source,destination,vis);
        return found;
    }
}