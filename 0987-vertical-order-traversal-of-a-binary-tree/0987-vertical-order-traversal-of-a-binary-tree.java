/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<int[]>triplet;
    private void DFS(TreeNode root,int row,int col){
        if(root==null)return;
        triplet.add(new int[]{col,row,root.val});
        DFS(root.left,row+1,col-1);
        DFS(root.right,row+1,col+1);
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        triplet=new ArrayList<>();
        if(root==null)return new ArrayList<>();
        DFS(root,0,0);
        //sort them by colm first then row then also multiple node then sort by root.val

        /*logic:
        a-b<0 it means a comes before b
        a-b>0 it means b comes before a
        a-b=0 it means both are equal
        here we have list
        a[0]:column
        a[1]:row
        a[2]:root.value

        case 1: column is different
        if(a.col!=b.col) sort by column

        case 2: column is same
        if(a.row!=b.row) sort by row

        case 3: when row and column both are same
        sort by root.value


         */
        Collections.sort(triplet,(a,b)->{
            if(a[0]!=b[0])return a[0]-b[0];//when column is different
            if(a[1]!=b[1])return a[1]-b[1];//when columns is same bit row is different
            return a[2]-b[2];
        });

        //grouping the same col in the inner arrayList and all innerarray list store in one bigger arrayList

        List<List<Integer>>res=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        int prevCol=triplet.get(0)[0];
       
        for(int node[]:triplet){
            int col=node[0];
            int val=node[2];
            //same column keep adding
            if(col==prevCol){
                curr.add(val);
            }else{
                //column changes store the previos column result in res
                res.add(curr);

                //start a new column list
                curr=new ArrayList<>();
                curr.add(val);

                //update prevCol
                prevCol=col;

            }
            //last group still not added
            
        }
        res.add(curr);
        return res;
    }
}