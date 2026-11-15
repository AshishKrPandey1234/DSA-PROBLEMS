class Solution {
    public int maxProduct(int[] nums) {
       int prod=1;
       int maxProd=Integer.MIN_VALUE;
       //kadanes algo do multiplication from left to right and keep updating max if while travesing it become 0 make prod=1 and than repeat same thing from righ to left
       for(int i=0;i<nums.length;i++){
        prod*=nums[i];
        maxProd=Math.max(prod,maxProd);
        if(prod==0) prod=1;
       }
       prod=1; 
       for(int i=nums.length-1;i>=0;i--){
        prod*=nums[i];
        maxProd=Math.max(maxProd,prod);
        if(prod==0)prod=1;
       }
       return maxProd;
    }
}