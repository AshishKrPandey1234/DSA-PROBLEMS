class Solution {
    public boolean isValid(char board[][],int row,int col,char num){
        //we can check row and col individually in the single loop only
        //to check one entire row move the entire column one by one that is j traverse and for checking entire column move that particular entire row
        for(int j=0,i=0;j<9;j++,i++){
            if(board[row][j]==num)return false;//row check done
            if(board[i][col]==num)return false;//column check done
        }
        //checking for the grid
        int SRow=(row/3)*3;
        int SCol=(col/3)*3;
        //this two formula will help you in the reaching to the first index of each subgris than traverse each subgrid and compare 
        for(int i=SRow;i<SRow+3;i++){
            for(int j=SCol;j<SCol+3;j++){
                if(board[i][j]==num)return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;//if '.' is present ignore it because we will only store number inside char num 

            
                char num=board[i][j];
                //since we have stored board[i][j] in the num varible  compare num with board ele so to avoid comparison with itslef we are marking that particular element as '.'
                board[i][j]='.';

                if(!isValid(board,i,j,num))return false;
                //when comparison done with one cell for other cell we again remove '.' and make it original since loop goes to other cell so old should be restored this process is called backtrack

                board[i][j]=num;


            }
        }
        return true;
    }
}