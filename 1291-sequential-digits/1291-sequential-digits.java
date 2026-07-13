class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer>ans=new ArrayList<>();
        String s="123456789";
        String lo=String.valueOf(low);
        String hi=String.valueOf(high);
        for(int len=lo.length();len<=hi.length();len++){
            for(int start=0;start<=9-len;start++){
                int num=Integer.parseInt(s.substring(start,start+len));
                if(num>=low && num<=high){
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}