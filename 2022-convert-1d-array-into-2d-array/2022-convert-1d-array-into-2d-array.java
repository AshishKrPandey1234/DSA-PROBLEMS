class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        //check if it is is possible m*n form 2d matrix for eg 10 element in sequential order and m=3 and n=3 given than it is not possible to fit
        if(original.length!=m*n)return new int[0][0];
        int ans[][]=new int[m][n];
        int index=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=original[index++];
            }
        }
        return ans;
    }
}