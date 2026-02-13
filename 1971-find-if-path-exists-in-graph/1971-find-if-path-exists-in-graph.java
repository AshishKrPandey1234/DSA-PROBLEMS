class Solution {
    private boolean dfs(List<List<Integer>>adj,int currNode,int destination,boolean vis[]){
        vis[currNode]=true;
        if(currNode==destination)return true;
        for(int nbr:adj.get(currNode)){
            if(!vis[nbr]){
                boolean found=dfs(adj,nbr,destination,vis);
                if(found)return true;
            }
            
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //step1 : create an adjacency list
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
        boolean found=dfs(adj,source,destination,vis);
        return found;
    }
}