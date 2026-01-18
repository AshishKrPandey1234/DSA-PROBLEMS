class Solution {
    public int hammingWeight(int n) {
        //set bit are :1
        //i times right shift
        //for i=0 taking example of 13 : (1101>>(0))&1 =1res+=1
        //i=1 (1101>>1)&1=>110&1=0 therefore res remain=1
        //i=2 (1101>>2)&1=> 11&1=1 res+=2
        //i=3 (1101>>3)&1=>1&1=1 res+=3
        //number end so why loop 32 because java int is 32 bit even if number is small it will g upto 32 which is almost constant
        int countSetBit=0;
        for(int i=0;i<32;i++){
            if(((n>>i)&1)==1)countSetBit+=1;
        }
        return countSetBit;
    }
}