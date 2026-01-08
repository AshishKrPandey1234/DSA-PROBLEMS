class Solution {
    public int minFallingPathSum(int[][] matrix) {
        //space optimization
        int m=matrix.length;
        int n=matrix[0].length;
        int prev[]=new int[n];
        //first row  will be same 
        for(int col=0;col<n;col++){
            prev[col]=matrix[0][col];
        }
        for(int row=1;row<m;row++){
            int curr[]=new int[n];
            for(int col=0;col<n;col++){
                int down=prev[col];//pichle wale row ka col
                int leftdiag=(col>0)?prev[col-1]:(int)1e9;
                int rightdiag=(col<m-1)?prev[col+1]:(int)1e9;
                curr[col]=matrix[row][col]+Math.min(down,Math.min(leftdiag,rightdiag));
            }
            prev=curr;
        }
        int minSum=(int)1e9;
        for(int val:prev){
            minSum=Math.min(minSum,val);

        }
        return minSum;
    }
}