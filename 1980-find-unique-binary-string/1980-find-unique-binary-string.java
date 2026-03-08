class Solution {
    public String findDifferentBinaryString(String[] nums) {
        //since it is given that n(that is length of each string)==nums.length(array length)
        //from starting flip each differnt bit from each string
        //like if given{111,011,001} flip first char of first string 0 second char of second string 0 and third char of 3 string flip ans becomme 0 ans:{000}

        //so first strig ka first char , second string ka second char can be traversed by single for loop

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            if(nums[i].charAt(i)=='0'){
                sb.append('1');
            }
            else if(nums[i].charAt(i)=='1'){
                sb.append('0');
            }
        } 
        return sb.toString();
    }
}