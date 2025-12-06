class Solution {
    public int singleNumber(int[] nums) {
        //bitwise xor operator when we do xor of two same number than we got 0 
        //if 0 xor unique=uniue is the ans
        int res=0;
        for(int num:nums){
            res=res^num;
        }
        return res;
    }
}