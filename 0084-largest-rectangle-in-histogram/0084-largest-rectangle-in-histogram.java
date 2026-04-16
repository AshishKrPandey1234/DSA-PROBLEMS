class Solution {
    public int largestRectangleArea(int[] heights) {
       int maxArea=0;
       int n=heights.length;

       //traverse through all possible start index
       for(int i=0;i<n;i++){
        int minHeight=Integer.MAX_VALUE;

        //traverse through all possible end index
        for(int j=i;j<n;j++){
            minHeight=Math.min(minHeight,heights[j]);
            int area=minHeight*(j-i+1);//area of rectangle

            maxArea=Math.max(maxArea,area);
        }
       } 
       return maxArea;
    }
}