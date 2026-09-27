class Solution {
    public int countTriples(int n) {
        int count=0;int sum=0;
        for(int a=1;a<n;a++){
            for(int b=1;b<n;b++){
                sum=a*a+b*b;
                if((int)Math.sqrt(sum)*(int)Math.sqrt(sum)==sum && Math.sqrt(sum)<=n)count++;
            }
        }
        return count;
    }
}