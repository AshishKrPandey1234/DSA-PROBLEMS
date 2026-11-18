import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        int n=nums.length;
        if(n<3) return ans;
        Arrays.sort(nums);
        for(int fixed=0;fixed<n-2;fixed++){
            if(fixed>0 && nums[fixed]==nums[fixed-1]) continue;
            int left=fixed+1;
            int right=n-1;
            while(left<right){
                int sum=nums[fixed]+nums[left]+nums[right];
                if(sum<0)left++;
                else if(sum>0)right--;
                else{
                    ans.add(Arrays.asList(nums[fixed],nums[left],nums[right]));
                    left++; right--;
                    while(left<right && nums[left]==nums[left-1])left++;
                    while(left<right && nums[right]==nums[right+1]) right--;
                }
            }
            
            
        }
        return ans;
    }
}