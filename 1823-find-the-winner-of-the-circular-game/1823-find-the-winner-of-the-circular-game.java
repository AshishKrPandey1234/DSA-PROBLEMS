class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer>circle=new ArrayList<>();
        for(int i=1;i<=n;i++){
            circle.add(i);//adding all the player
        }
        int i=0;
        while(circle.size()>1){
            int idx=(i+k-1)%circle.size();
            circle.remove(idx);
            //jaise hi koi index remove hoga waise hi ek piche aa jayega array mai for eg:[1,2,3,4,5] jaise hi 2 remove hua waise hi 3 ek piche shift ho jayega and array =[1,3,4,5]
            i=idx;
        }
        return circle.get(0);
    }
}