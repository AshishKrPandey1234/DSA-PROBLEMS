class Solution {
    public int mirrorDistance(int n) {
        int num=n;
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
            
        }
        System.out.println(rev);
        return Math.abs(rev-n);
        
    }
}