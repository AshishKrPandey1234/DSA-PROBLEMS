class Solution {
    public int bulbSwitch(int n) {
        //take example of 1 to 20 bulb and firstly traverse all than second time all the multiple of third time all the multiple of three this way when you will go upto 20 u will find that bulb at 1 , 4 ,9, 16 are only on because thay have odd numbewr of tick second thing for example 9 : 16 have one odd factor that is (4,4) because remaining are forming fair like(1,16 ) than 16,1) , (2,8) than (8,2) but (4,4)is alone so all the perfect square count
        //     int count=0;
        //     for(int i=1;i*i<=n;i++){
        //         count++;
        //     }
        //     return count;
        //method 2 shortcut one
        //just return the squareroot of last number do type casting to int that much only number are present which is perfect square
        return (int) Math.sqrt(n);
    }

}