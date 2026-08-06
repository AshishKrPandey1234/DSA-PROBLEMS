class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true){
            int prod=1;
            int num=n;
            while(num!=0){
                int d=num%10;
                prod*=d;
                num/=10;
            }
            if(prod%t==0) return n;
            n++;
        }
    }
}