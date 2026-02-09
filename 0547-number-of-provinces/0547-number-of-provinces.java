class Solution {
    private void dfs(int node,List<List<Integer>>adjList,boolean vis[]){
        vis[node]=true;
        for(int nbr:adjList.get(node)){
            if(!vis[nbr]){
                dfs(nbr,adjList,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>>adjList=new ArrayList<>();
        int V=isConnected.length;
        for(int i=0;i<V;i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        boolean vis[]=new boolean[V];
        int count=0;
        for(int i=0;i<V;i++){
            if(!vis[i]){
                count++;
                dfs(i,adjList,vis);
            }
        }
        return count;
    }
}