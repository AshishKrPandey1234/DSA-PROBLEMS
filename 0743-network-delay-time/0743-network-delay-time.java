class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int cost=times[i][2];
            adj.get(u).add(new int[]{v,cost});
        }
        int dist[]=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        PriorityQueue<int[]>pq=new PriorityQueue<>((x,y)->Integer.compare(x[0],y[0]));
        pq.add(new int[]{0,k});//{cost,srcNode}
        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            int dis=curr[0];
            int node=curr[1];

            if(dis > dist[node]) continue;
            for(int nbr[]:adj.get(node)){
                int adjNode=nbr[0];
                int edWt=nbr[1];
                //relaxation: if previous node and coming wt is less than the code of adjNode than update it 
                if(dist[node]+edWt<dist[adjNode]){
                    dist[adjNode]=dist[node]+edWt;
                    pq.add(new int[]{dist[adjNode],adjNode});
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            else max= Math.max(max,dist[i]);
        }
        return max;
    }
}