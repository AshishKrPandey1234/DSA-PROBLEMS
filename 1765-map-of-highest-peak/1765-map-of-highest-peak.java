class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        int n=isWater.length;
        int m=isWater[0].length;
        int cellHeights[][]=new int[n][m];
        for(int row[]:cellHeights){
            Arrays.fill(row,-1);
        }
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWater[i][j]==1){
                    q.offer(new int[]{i,j});
                    cellHeights[i][j]=0;
                }
            }
        }
        while(!q.isEmpty()){
            int curr[]=q.poll();
            int r=curr[0];
            int c=curr[1];
            for(int i=0;i<4;i++){
                int nR=r+dr[i];
                int nC=c+dc[i];
                if(nR>=0 && nR<n && nC>=0 && nC<m && cellHeights[nR][nC]==-1){
                    cellHeights[nR][nC]=cellHeights[r][c]+1;
                    q.offer(new int[]{nR,nC});
                }
            }
        }
        return cellHeights;

    }
}