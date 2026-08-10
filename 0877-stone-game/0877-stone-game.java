class Solution {
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        long alice=0;
        long bob=0;
        int last=piles.length-1;
        int j=0;
        boolean flag=true;
        while(j<last){
            if(flag==true){//alice will get first chance 
                if(piles[j]>=piles[last])alice+=piles[j++];
                else alice+=piles[last--];
            }
            else{
                if(piles[j]>=piles[last])bob+=piles[j++];
                else bob+=piles[last--];
            }
        }
        if(alice>bob)return true;
        return false;
    }
}