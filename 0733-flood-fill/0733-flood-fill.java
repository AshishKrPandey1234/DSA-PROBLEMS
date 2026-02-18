class Solution {
    private void dfs(int image[][],int row,int col,int currColor,int newColor,boolean vis[][]){
        if(row<0||row>=image.length||col<0||col>=image[0].length||image[row][col]!=currColor||vis[row][col]==true){
            return;
        }
        image[row][col]=newColor;
        vis[row][col]=true;
        int adj[][]={{row-1,col},{row,col-1},{row+1,col},{row,col+1}};
        for(int nbr[]:adj){
            dfs(image,nbr[0],nbr[1],currColor,newColor,vis);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int rows=image.length;
        int cols=image[0].length;
        boolean vis[][]=new boolean[rows][cols];
        dfs(image,sr,sc,image[sr][sc],color,vis);
        return image;
    }
}