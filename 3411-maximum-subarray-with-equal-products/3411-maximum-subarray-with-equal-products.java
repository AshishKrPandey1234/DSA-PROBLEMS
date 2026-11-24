class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private int lcm(int a,int b){
        return a/gcd(a,b)*b;
    }

    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int prod = 1;
            int currGcd = 0;//because gcd(x,0)=x
            int currLcm = 1;//because lcm(x,1)=x
            for (int j = i; j < n; j++) {
                prod *= nums[j];
                currGcd = gcd(currGcd, nums[j]);
                currLcm = lcm(currLcm, nums[j]);
                if (prod == currGcd * currLcm) {
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }
}