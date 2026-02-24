class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int vis[][]=new int[n][m];
        int dist[][]=new int[n][m];
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i,j,0});
                    vis[i][j]=1;
                }
            }
        }
        int delRow[]={-1,0,1,0};
        int delCol[]={0,1,0,-1};
        while(!q.isEmpty()){
            int cell[]=q.poll();
            int row=cell[0];
            int col=cell[1];
            int steps=cell[2];
            dist[row][col]=steps;
            for(int i=0;i<4;i++){
                int nRow=row+delRow[i];
                int nCol=col+delCol[i];
                if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && vis[nRow][nCol]==0){
                    q.add(new int[]{nRow,nCol,steps+1});
                    vis[nRow][nCol]=1;
                }
                

                
            
            }
        }
        return dist;

        
    }
}