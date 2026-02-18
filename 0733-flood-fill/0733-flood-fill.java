class Solution {
    private void dfs(int image[][],int row,int col,int currColor,int newColor){
        if(row<0||row>=image.length||col<0||col>=image[0].length||image[row][col]!=currColor||image[row][col]==newColor){
            return;
        }
        image[row][col]=newColor;
        int adj[][]={{row-1,col},{row,col-1},{row+1,col},{row,col+1}};
        for(int nbr[]:adj){
            dfs(image,nbr[0],nbr[1],currColor,newColor);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        dfs(image,sr,sc,image[sr][sc],color);
        return image;
    }
}