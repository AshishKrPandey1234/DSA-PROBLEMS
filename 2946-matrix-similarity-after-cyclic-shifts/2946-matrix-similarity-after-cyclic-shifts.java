class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        int temp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp[i][j]=mat[i][j];
            }
        }
        k=k%m;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //even indexed are cyclically shifted to left in the temp array
                if(i%2==0){
                    //if k=4 and m=3 than k=k%m=4%3=1
                    int newIdx=(j-k+m)%m;
                    temp[i][newIdx]=mat[i][j];

                }//odd indexed are cyclically shifted to right
                else{
                    int newIdx=(j+k)%m;
                    temp[i][newIdx]=mat[i][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(temp[i][j]!=mat[i][j])return false;
            }
        }
        return true;
    }
}