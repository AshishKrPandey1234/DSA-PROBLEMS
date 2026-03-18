/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        if(root==p || root == q)return root;

        TreeNode leftVal=lowestCommonAncestor(root.left,p,q);
        TreeNode rightVal=lowestCommonAncestor(root.right,p,q);
        
        if(leftVal!=null && rightVal!=null)return root;
        else if(leftVal==null)return rightVal;
        else return leftVal;
        
    }
}