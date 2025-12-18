class Solution {
    public boolean isValid(char board[][],int row,int col,char num){
        //checking for row
        for(int j=0,i=0;j<9;j++,i++){
            if(board[row][j]==num)return false;
            if(board[i][col]==num)return false;
        }
        //checking for column
        // for(int i=0;i<9;i++){
        //     if(board[i][col]==num)return false;
        // }

        //checking for 3*3 Grid
        int sRow=(row/3)*3;//this will find the starting row and starting col  of subgrid trick is dividing current row by 3 than multiplying by 3
        int sCol=(col/3)*3;
        for(int i=sRow;i<sRow+3;i++){
            for(int j=sCol;j<sCol+3;j++){
                if(board[i][j]==num)return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;//it means pahle se row khali hai than continue jo khai hai usee check nahi karenge
                
                char num=board[i][j];
                board[i][j]='.';
                if(!isValid(board,i,j,num))return false;
                board[i][j]=num;
            }
        }
        return true;
    }
}