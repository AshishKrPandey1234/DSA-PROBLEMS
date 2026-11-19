class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=n-2;
        //step 1 : find the correct pivot index
        while(pivot>=0 && nums[pivot]>=nums[pivot+1]) pivot--;

        //step 2: check weather pivot reaches -1 it is only possble when entire arrray is in dessending order means array is in its max so sort the complete array in assending order

        if(pivot<0){
            Arrays.sort(nums);
            return;//no need to go down
        }

        //step 3: find out the successor
        int successor=pivot+1;
        for(int i=pivot+1;i<n;i++){
            if(nums[i]>nums[pivot] && nums[i]<=nums[successor]){
                successor=i;
            }
        }

        //step 4: swap pivot element with the successor one
        int temp=nums[pivot];
        nums[pivot]=nums[successor];
        nums[successor]=temp;

        //step 5: once swap is finished sort the array from pivot +1 that is the only way we can get the just greater permutation

        Arrays.sort(nums,pivot+1,n);

    }
}