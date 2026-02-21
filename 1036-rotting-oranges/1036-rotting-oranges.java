class Pair{
    int row;
    int col;
    int time;
    Pair(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair>q=new LinkedList<>();
        int vis[][]=new int[n][m];
        int cntFresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));//initially time will be 0 only the starting one is added in the queue
                    vis[i][j]=2;
                }else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1){
                    cntFresh++;
                }
            }
        }
        int time=0;
        int delRow[]={-1,0,1,0};
        int delCol[]={0,1,0,-1};
        int cnt=0;
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int tm=q.peek().time;
            //time=Math.max(time,tm);
            time=tm;
            q.remove();
            for(int i=0;i<4;i++){
                int nRow=r+delRow[i];
                int nCol=c+delCol[i];
                if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && vis[nRow][nCol]==0 && grid[nRow][nCol]==1){
                q.add(new Pair(nRow,nCol,tm+1));
                    vis[nRow][nCol]=2;
                    cnt++;
                }
                
            }
            
        }
        if(cnt!=cntFresh)return -1;
        return time;

    }
}