class Solution {
    int n,m;
    boolean vis[][];
    private boolean DFS(int i,int j, int pi,int pj,char grid[][]){
        vis[i][j]=true;
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        for(int k=0;k<4;k++){
            int ni=dr[k]+i;
            int nj=dc[k]+j;
        
            //check out of bound condition
            if(ni<0 || ni>=n || nj<0 || nj>=m)continue;
            //check both character is same or not
            if(grid[i][j]!=grid[ni][nj])continue;
            if(!vis[ni][nj]){
                if(DFS(ni,nj,i,j,grid)) return true;
            }
        //if visited ans new indexes parent is !pi,pj at that time there must be cycle so the position where we started we reached to that posonly
            else if(ni!=pi || nj!=pj){
                return true;
            }
        }
        return false;
    }
    public boolean containsCycle(char[][] grid) {
        n=grid.length;
        m=grid[0].length;
        vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j]){
                    if(DFS(i,j,-1,-1,grid)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}