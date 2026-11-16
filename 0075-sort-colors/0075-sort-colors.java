class Solution {
    public void sortColors(int[] nums) {
        int left=0, curr=0, right=nums.length-1;
        // Dutch Flag Algorithm: Partition the array into three regions—
// 0s on the left, 1s in the middle, and 2s on the right using three pointers.

// Case 0: If the current element is 0, swap it with the left pointer, then increment both left++ and curr++.
// Reason: 'left' never points to a 2 (since all 2s are handled by the right boundary). 
// When we swap arr[curr] (0) with arr[left], the value landing at curr is guaranteed to be 1 
// (either because left == curr, or because left points to a 1 that was already scanned). 
// Thus, curr has already evaluated this incoming 1 and can safely move forward.

// Case 2: If the current element is 2, swap it with the right pointer and decrement right--.
// Keep curr unchanged because the incoming element swapped from the right is completely unexamined 
// (it could be a 0, 1, or 2) and must be evaluated in the next iteration.

// Case 1: If the current element is 1, simply increment curr++.
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