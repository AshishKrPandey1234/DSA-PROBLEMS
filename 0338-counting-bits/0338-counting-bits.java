class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++){
            int num=i;
            int count=0;
            while(num>0){
                if((num & 1)==1)count++;//doing and operaion with the last digit of number
                num=num>>1;//right shift
            }
            ans[i]=count;
        }
        return ans; 
        
    }
}