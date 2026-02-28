class Solution {
    private boolean checkByBFS(int start,int graph[][],int color[]){
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        color[start]=0;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int nbr:graph[node]){
                if(color[nbr]==-1){
                    color[nbr]=1-color[node];
                    q.add(nbr);
                }else if(color[nbr]==color[node]){
                    return false;
                }

            }
        }
        return true;
        
    }
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int color[]=new int[n];
        for(int i=0;i<n;i++)color[i]=-1;//uncolored
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(checkByBFS(i,graph,color)==false)return false;
            }
        }
        return true;

    }
}