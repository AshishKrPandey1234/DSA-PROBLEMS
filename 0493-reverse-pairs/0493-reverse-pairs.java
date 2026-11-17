class Solution {
    public int reversePairs(int[] nums) {
        return divide(nums,0,nums.length-1);
    }
    private int divide(int[] nums,int left, int right){
        if(left>=right) return 0;
        int mid=left+(right-left)/2;
        int count=0;
        count+=divide(nums,left,mid);//divide first half
        count+=divide(nums,mid+1,right);
        //count cross pairs befor mergin the pair in two half left one is twice greate of right half
        count+=countPairs(nums,left,mid,right);
        conquer(nums,left,mid,right);
        return count;
    }private int countPairs(int[] nums,int left,int mid,int right){
        int count=0;
        int j=mid+1;
        for(int i=left;i<=mid;i++){
            while(j<=right && (long)nums[i]>2L*nums[j]){
                j++;
            }
            count+=j-(mid+1);
        }
        return count;
    }
    private void conquer(int[] nums, int left, int mid, int right){
        int i=left;//starting point of the first array
        int j=mid+1;//starting point of the second half of the array
        int k=0;
        int temp[]=new int[right-left+1];
        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]) temp[k++]=nums[i++];
            else temp[k++]=nums[j++];
        }
        while(i<=mid) temp[k++]=nums[i++];
        while(j<=right) temp[k++]=nums[j++];
        for(int idx=0;idx<temp.length;idx++) nums[left+idx]=temp[idx];
    }
    
}