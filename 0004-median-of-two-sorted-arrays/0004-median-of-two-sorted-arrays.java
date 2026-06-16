class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //brute force merge two sorted array than check weatehr resultant array is of even or odd length if odd length return the mid value or else return the (mid+mid-1) values/2
        int len1=nums1.length;
        int len2=nums2.length;
        int res[]=new int[len1+len2];
        int i=0,j=0,k=0;
        while(i<len1 && j<len2){
            //whoever will be smaller get inserted
            if(nums1[i]<=nums2[j]){
                res[k++]=nums1[i];
                i++;
            }else if(nums2[j]<nums1[i]){
                res[k++]=nums2[j];
                j++;
            }
        }
        if(i==len1){
            while(j<len2){
                res[k++]=nums2[j];
                j++;
            }
        }
        if(j==len2){
            while(i<len1){
                res[k++]=nums1[i];
                i++;
            }
        }
        if((len1+len2)%2==1){
            int ans= res[(len1+len2)/2];
            return ans;
        }
        int idx1=((len1+len2)/2)-1;
        int idx2=(len1+len2)/2;
        int ans= res[idx1]+res[idx2];
        return ans/2.0;
    }
}