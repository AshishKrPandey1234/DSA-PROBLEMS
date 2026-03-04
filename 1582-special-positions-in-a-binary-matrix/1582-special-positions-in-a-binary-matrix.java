class Solution {
    public int numSpecial(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    boolean special=true;
                    //check row
                    for(int col=0;col<m;col++){
                        if(col!=j && mat[i][col]==1){
                            special=false; break;
                        }
                    }        
                    //check col
                    for(int row=0;row<n && special==true;row++){
                        if(row!=i && mat[row][j]==1){
                            special=false; break;
                        }
                    }
                    if(special==true)count++;
                }
            }
        }
        return count;
    }
}