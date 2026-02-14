class Solution {
    public int findCircleNum(int[][] isConnected) {
        int V=isConnected.length;
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int u=0;u<V;u++){
            for(int v=0;v<V;v++){
                if(isConnected[u][v]==1 && u!=v){
                    adj.get(u).add(v);
                    adj.get(v).add(u);
                }
            }
        }
        boolean vis[]=new boolean[V];
        int cnt=0;
        for(int i=0;i<V;i++){
            if(!vis[i]){
                int src=i;
                dfs(adj,vis,src);
                cnt++;
            }
        }
        return cnt;
        
    }
    private void dfs(List<List<Integer>>adj,boolean vis[],int currNode){
        vis[currNode]=true;
        for(int nbr:adj.get(currNode)){
            if(!vis[nbr]){
                dfs(adj,vis,nbr);;
            }
        }
    }
}