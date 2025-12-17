class Solution {
    private boolean isSafe(char board[][],int n,int row,int col){
        //checking for each row one by one
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q')return false;
        }
        //checking for each column one by one
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q')return false;
        }
        //checking for the north east direction ↗(here i decreases and j increases)
        int i=row,j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q')return false;
            i--;
            j++;
        }
        //checking for the north west direction ↖(here i decreases and j decreases)
        i=row;j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q')return false;
            i--;
            j--;
        }
        return true;
    }
    private void solve(char board[][],int row,List<List<String>>ans){
        int n=board.length;
        if(row==n){
            //copy 2d array into list of string 
            List<String> L=new ArrayList<>();
            for(int i=0;i<n;i++){
                StringBuffer sb=new StringBuffer();
                for(int j=0;j<n;j++){
                    sb.append(board[i][j]);
                }
                L.add(sb.toString());
            }
            ans.add(L);
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,n,row,j)){
                board[row][j]='Q';
                solve(board,row+1,ans);//calling for the next row
                board[row][j]='.';//backtrack
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>>ans=new ArrayList<>();
        solve(board,0,ans);
        return ans;
    }
}