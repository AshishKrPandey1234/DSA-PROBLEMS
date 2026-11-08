class Solution {
    public int countServers(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    boolean canCommunicate=false;

                    //check for communication in the same row
                    for(int col=0;col<m;col++){
                        if(col!=j && grid[i][col]==1){
                            canCommunicate=true;
                            break;
                        }
                    }
                    if(canCommunicate){
                        count++;
                    }else{
                        //check for communication in the same column
                        for(int row=0;row<n;row++){
                            if(row!=i && grid[row][j]==1){
                                canCommunicate=true;
                                break;
                            }
                        }
                        if(canCommunicate){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}