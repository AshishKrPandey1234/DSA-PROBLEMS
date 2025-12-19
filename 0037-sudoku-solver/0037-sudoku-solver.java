class Solution {
    private boolean solve(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char ch='1';ch<='9';ch++){
                        if(isValid(board,i,j,ch)){
                            board[i][j]=ch;

                            if(solve(board)==true){
                                return true;
                            }
                            else{
                                board[i][j]='.';
                            }
                        }
                        
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isValid(char board[][],int row,int col,char ch){
        for(int j=0,i=0;j<9;j++,i++){
            //checking validity for row
            if(board[row][j]==ch)return false;

            //checking validity for cols
            if(board[i][col]==ch)return false;
            

            //checking for subgrid
            if(board[3*(row/3)+i/3][3*(col/3)+j%3]==ch)return false;
        }
        return true;

    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}