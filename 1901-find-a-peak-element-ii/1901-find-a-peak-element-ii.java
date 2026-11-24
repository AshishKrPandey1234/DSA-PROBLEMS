class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int up=-1;
                if(i>0) up=mat[i-1][j];
                int down=-1;
                if(i+1<n) down=mat[i+1][j];
                int left=-1;
                if(j>0)left=mat[i][j-1];
                int right=-1;
                if(j+1<m)right=mat[i][j+1];
                if(mat[i][j]>up && mat[i][j]>down && mat[i][j]>left && mat[i][j]>right) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}