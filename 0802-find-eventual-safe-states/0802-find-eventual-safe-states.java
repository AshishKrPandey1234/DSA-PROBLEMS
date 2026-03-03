class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V=graph.length;
        int vis[]=new int[V];
        int pathVis[]=new int[V];
        int check[]=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                dfsCheck(i,graph,vis,pathVis,check);
            }
        }
        List<Integer>safeNodes=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(check[i]==1){
                safeNodes.add(i);
            }
        }
        return safeNodes;
        
    }
    private boolean dfsCheck(int node,int graph[][],int vis[],int pathVis[],int check[]){
        vis[node]=1;
        pathVis[node]=1;
        check[node]=0;
        for(int nbr:graph[node]){
            if(vis[nbr]==0){
                if(dfsCheck(nbr,graph,vis,pathVis,check)==true){
                    return true;
                }
            }else if(pathVis[nbr]==1){
                return true;
            }
        }
        check[node]=1;
        pathVis[node]=0;
        return false;
    }
}