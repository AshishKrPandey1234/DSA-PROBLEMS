class Solution {
    private boolean dfs(List<List<Integer>>adj,int src,boolean vis[],boolean onePath[]){
        vis[src]=true;
        onePath[src]=true;
        for(int nbr:adj.get(src)){
            if(!vis[nbr])
            {
                if(dfs(adj,nbr,vis,onePath))return true;
            }
            
            if(vis[nbr] && onePath[nbr])return true;
        }
        onePath[src]=false;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer>list=new ArrayList<>();
            for(int j=0;j<graph[i].length;j++){
                list.add(graph[i][j]);
            }
            adj.add(list);
        }
        boolean vis[]=new boolean[n];
        boolean onePath[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(adj,i,vis,onePath);
            }
        }
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<onePath.length;i++){
            if(!onePath[i])ans.add(i);
        }
        return ans;
    }
}