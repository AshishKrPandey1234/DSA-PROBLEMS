class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer>set=new HashSet<>();
        //since every element occur twice so we will keep one sum variable where sum of array will be there we will add unique ele in set now we will calculate the sum of set *2, totalsum-setsum will be the answer
        int sum=0;
        int setSum=0;
        for(int num:nums){
            sum+=num;
            if(!set.contains(num)){
                set.add(num);
                setSum+=num;
            }
        }
        return 2*setSum-sum;
    }
}