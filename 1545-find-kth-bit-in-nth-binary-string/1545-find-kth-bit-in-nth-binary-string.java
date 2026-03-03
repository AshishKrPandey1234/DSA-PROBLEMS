class Solution {
    public char findKthBit(int n, int k) {
        int len=(int)Math.pow(2,n)-1;
        if(n==1)return '0';
        if(k<Math.ceil(len/2.0)){
            return findKthBit(n-1,k);
        }
        else if(k==Math.ceil(len/2.0))return '1';
        else{
            //k>ceil(len/2)
            char ch=findKthBit(n-1,(len-k+1));//handle reverse
            return (ch=='0')?'1':'0';//return flip bit
        }
        
    }
}