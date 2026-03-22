class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        //we can rotate up to 4 times only beacuse on 4th rotation it will come to original state
        for(int i=0;i<4;i++){
            if(check(mat,target))return true;
            else rotate(mat);
        }
        return false;
    }
    private boolean check(int mat[][],int target[][]){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j])return false;
            }
        }
        return true;
    }
    //rotate in clockwise is equal to =traspose +row reverse
    public void rotate(int mat[][]){
        //tranpose
        transpose(mat);
        int n=mat.length;
        for(int i=0;i<n;i++){
            int left=0,right=n-1;
            //reverse
            while(left<right){
                int temp=mat[i][left];
                mat[i][left]=mat[i][right];
                mat[i][right]=temp;
                left++;
                right--;
            }
        }

    }
    private void transpose(int mat[][]){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
}