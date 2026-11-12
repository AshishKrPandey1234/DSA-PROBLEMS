class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        int len1=1;
        int len2=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]) len1++;
            else len1=1;
            if(nums[i]>nums[i+1]) len2++;
            else len2=1;
            max=Math.max(max,Math.max(len1,len2));
        }
        return max;
    }
}

// public int longestMonotonicSubarray(int[] nums) {
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length-1;i++){
//             int len1=0;
//             int len2=0;
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]<nums[j]){
//                     len1++;
//                 }
//                 if(nums[i]>nums[j]){
//                     len2++;
//                 }
//                 max=Math.max(max,Math.max(len1,len2));
//             }

//         }
//         return max;
//     }