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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)return new TreeNode(val);
        TreeNode curr=root;
        while(true){
            if(curr.val<val){
                if(curr.right!=null){//this will help in traversing in the tree
                    curr=curr.right;
                }
                //if found correct position than add it it is 100  percent sure that node will be added at last only
                else{
                    curr.right=new TreeNode(val);
                    break;
                } 
            }else{
                if(curr.left!=null){
                    curr=curr.left;
                }else{
                    curr.left=new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}