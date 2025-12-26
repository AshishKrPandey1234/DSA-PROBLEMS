class Solution {
    public int longestOnes(int[] arr, int k) {
        int start=0, end=0;
        int res=0;
        int count=0;
        while(end<arr.length){
            if(arr[end]==0) count++;
            //shrink the windows from left 
            //if number of zeroes are greater than k
            while(count>k){
                if(arr[start]==0){
                    count--;
                }
                start++;
            }
            res=Math.max(res,(end-start+1));
            end++;
        }
        return res;
        
    }
}