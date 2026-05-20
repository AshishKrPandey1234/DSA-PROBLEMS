class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                    //avoid using the same value 
                    nums2[j]=Integer.MIN_VALUE;
                    break;//once the match is found we break the inner loop
                }
            }
        }
        int result[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}