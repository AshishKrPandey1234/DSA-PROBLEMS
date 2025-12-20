class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        int rows=strs.length;//number pf rows ka length
        int cols=strs[0].length();//particular element that is string ka length hai
        for(int col=0;col<cols;col++){
            for(int row=1;row<rows;row++){
                if(strs[row-1].charAt(col)>strs[row].charAt(col)){
                    count++;
                    break;//no need to further check for this particular column
                }
            }
        }
        return count;
        
    }
}