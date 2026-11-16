class Solution {
    public void sortColors(int[] nums) {
        int left=0, curr=0, right=nums.length-1;
        //dutch flag algorithm in which we are dividing the array in three part assuming in left their should be 0 in mid 1 and in right 2
        // we will traverse current if we get 0 immediately swap with left as left part got 0 left is happily moving its pointer left++ and their is not any chance that left will ever get 1 because curr and left is started iterating from same location curr iterated first so if current would have got it would have swap with right 
        // now if curr got right it will swap with right and right-- but curr will remain same because what right had swap we dont know it can be 0 or 1 
        //now if curr=1 then directly do curr++
        while(curr<=right){
            if(nums[curr]==0){
                int temp=nums[curr];
                nums[curr]=nums[left];
                nums[left]=temp;
                left++; curr++;
                //as it is guranteed that left will never get 2 because curr is checking that as curr and left is started at same index
            }
            else if(nums[curr]==2){
                int temp=nums[curr];
                nums[curr]=nums[right];
                nums[right]=temp;
                right--;
            }else{
                curr++;
            }
        }
    }
}