class Solution {
    public int minElement(int[] nums) {
        int min=(int)1e5;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int temp=nums[i];
            while(temp!=0){
            int d=temp%10;
            sum+=d;
            temp=temp/10;
           }
        min=Math.min(min,sum);
        } 
        return min;
    }
}