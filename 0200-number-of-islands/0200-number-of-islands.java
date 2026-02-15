class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    private void BFS(int ro,int co,int vis[][],char grid[][]){
        vis[ro][co]=1;
        Queue<Pair>q=new LinkedList<>();
        q.offer(new Pair(ro,co));
        int n=grid.length;
        int m=grid[0].length;
        int dr[]={-1,0,1,0};
        int dc[]={0,-1,0,+1};

        /* k=0 → (-1, 0) = up
k=1 → (0, -1) = left
k=2 → (1, 0) = down
k=3 → (0, +1) = right

         */
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.poll();
            for(int k=0;k<4;k++){
                int nrow=row+dr[k];
                int ncol=col+dc[k];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1' && vis[nrow][ncol]==0){
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow,ncol));
                    
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        int cnt=0;
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                if(vis[row][col]==0 && grid[row][col]=='1'){
                    cnt++;
                    BFS(row,col,vis,grid);
                }
            }
        }
        return cnt;
        
    }
}