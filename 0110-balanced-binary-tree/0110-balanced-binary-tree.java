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
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int leftHt=getHt(root.left);
        int rightHt=getHt(root.right);
        if(Math.abs(leftHt-rightHt)<=1 && isBalanced(root.left) && isBalanced(root.right))return true;
        return false;
        
    }
    private int getHt(TreeNode root){
        if(root==null)return 0;
        int leftHt=getHt(root.left);
        int rtHt=getHt(root.right);
        return Math.max(leftHt,rtHt)+1;
    }
}