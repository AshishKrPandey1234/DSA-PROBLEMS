//this problem can be solved recursively by take and not take method we have to return all the array inside the array in which each array inside the main array whose sum is equal to target here one condition is given that we can take same thing multiple time till it is possible to take to make it sum ==target so when we have taken wrong element than we will backtrack and delete such element where we have taken wrong element so for that we have to extra three variable
//idx is for to move in the candidates array from idx =0 
//ans 2 d array is made for returning the ans wer inside it as this is quesston reuirement and main fnction return tyoe is alredy list<list<>> now in each array there is array which is called here temp in which we will add elemnt if it is possible to  make the result if somewhere i have wrong decisin than while recursion function finises it task when after finishing task goes down that will last elment fom the array aftet that at final iu will return the correct answer
class Solution {
    private void findCombination(int idx,int candidates[],int target,List<List<Integer>>ans,List<Integer>temp){
        if(idx==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        //this is a condition of take
        if(candidates[idx]<=target){
            temp.add(candidates[idx]);
            findCombination(idx,candidates,target-candidates[idx],ans,temp);
            temp.remove(temp.size()-1);//last elment ko remove kar degi inside bracket is index
        }
        findCombination(idx+1,candidates,target,ans,temp);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}