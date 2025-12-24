class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        Arrays.sort(capacity);
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        int count=0;
        for(int i=capacity.length-1;i>=0;i--){
           
           sum-=capacity[i];
           if(sum<=0) return capacity.length-i;
        }
        return -1;
    }
}