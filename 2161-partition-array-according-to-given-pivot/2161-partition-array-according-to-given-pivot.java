class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int temp[]=new int[n];
        int idx=0;
        for(int ele:nums){
            if(ele<pivot) temp[idx++]=ele;
        }
        for(int ele:nums){
            if(ele==pivot) temp[idx++]=ele;
        }
        for(int ele:nums){
            if(ele>pivot) temp[idx++]=ele;
        }
        return temp;
    }
}