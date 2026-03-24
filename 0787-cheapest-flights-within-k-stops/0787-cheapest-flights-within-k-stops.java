class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        //make adjacency list
        List<List<int[]>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int flight[]:flights){
            int u=flight[0];
            int v=flight[1];
            int cost=flight[2];
            adj.get(u).add(new int[]{v,cost});
        }
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{0,src,0});//{dist,node,cost}
        int dist[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        while(!q.isEmpty()){
            int curr[]=q.poll();
            int stops=curr[0];
            int node=curr[1];
            int cost=curr[2];

            if(stops>k)continue;

            for(int adjNode[]:adj.get(node)){
                int nextNode=adjNode[0];
                int edW=adjNode[1];
                if(cost+edW<dist[nextNode]  && stops<=k){
                    dist[nextNode]=cost+edW;
                    q.offer(new int[]{stops+1,nextNode,cost+edW});
                }
                
            }
        }
        if(dist[dst]==Integer.MAX_VALUE) return -1;
        return dist[dst];

    }
}