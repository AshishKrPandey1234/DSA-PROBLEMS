class Tuple{
    int first;
    int second;
    int third;
    Tuple(int _first,int _second,int _third){
        this.first=_first;
        this.second=_second;
        this.third=_third;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        int dist[][]=new int[n][m];
        for(int row[]:dist){
            Arrays.fill(row,(int)1e9);
        }
        //since we are creating min heap
        PriorityQueue<Tuple>pq=new PriorityQueue<>((x,y)->Integer.compare(x.first,y.first));
        pq.add(new Tuple(0,0,0));//initial dist first=0 cell address(0,0)
        int dr[]={-1,0,1,0};
        int dc[]={0,-1,0,1};
        while(!pq.isEmpty()){
            int maxDiff=pq.peek().first;
            int r=pq.peek().second;
            int c=pq.peek().third;
            pq.remove();
            if(r==n-1 && c==m-1)return maxDiff;
            if(maxDiff>dist[r][c])continue;
            for(int i=0;i<4;i++){
                int newR=dr[i]+r;
                int newC=dc[i]+c;
                if(newR>=0 && newR<n && newC>=0 && newC<m ){
                    
                    int currDiff=Math.abs(heights[r][c]-heights[newR][newC]);
                    int val=Math.max(currDiff,maxDiff);
                    
                
                    if(val<dist[newR][newC]){
                        dist[newR][newC]=val;
                    
                        pq.add(new Tuple(dist[newR][newC],newR,newC));
                    }
                }
            }

        }
        return 0;
    }
}