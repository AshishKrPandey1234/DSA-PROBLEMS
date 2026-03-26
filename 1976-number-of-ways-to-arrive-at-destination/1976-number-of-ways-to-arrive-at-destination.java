class Solution {
    static int MOD=(int)1e9+7;
    public int countPaths(int n, int[][] roads) {
        List<List<int[]>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<roads.length;i++){
            int u=roads[i][0];
            int v=roads[i][1];
            int cost=roads[i][2];
            adj.get(u).add(new int[]{v,cost});
            adj.get(v).add(new int[]{u,cost});
        }
        PriorityQueue<long[]>pq=new PriorityQueue<>((x,y)->Long.compare(x[0],y[0]));//min heap {dist,node} 
        pq.add(new long[]{0,0});//intital dist and node both are zero
        long dist[]=new long[n];
        Arrays.fill(dist,Long.MAX_VALUE);
        dist[0]=0;
        int ways[]=new int[n];
        Arrays.fill(ways,0);
        ways[0]=1;

        while(!pq.isEmpty()){
            long curr[]=pq.poll();
            long dis=curr[0];
            int node=(int)curr[1];

            if(dis>dist[node])continue;//skip the outdated enteries

            for(int []nbr: adj.get(node)){
                int adjNode=nbr[0];
                int edWt=nbr[1];
                //if shorter path is found than update distance and number of ways
                if(dis+edWt<dist[adjNode]){
                    dist[adjNode]=dis+edWt;

                    pq.add(new long[]{dist[adjNode],adjNode});
                    
                    ways[adjNode]=ways[node];//reset the ways
                    /* 0→1→3 explored first (cost higher), later 0→2→3 gives shorter path → old path via 1 is discarded */
/* Now paths to 3 can only come via node 2, so ways[3] = ways[2] (all paths reaching 2 extend to 3) */    
                }//// found another path with same shortest distance → add ways
                else if(dis+edWt==dist[adjNode]){
                    ways[adjNode]=(ways[adjNode]+ways[node])%MOD;
                }
            }
        }
        return ways[n-1]%MOD;
    }
}