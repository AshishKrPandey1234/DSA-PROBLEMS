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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //Base case : if both tree are null they are identical
        if(p==null && q==null)return true;

        //if only one tree is null or the value are different, they are identical 
        if(p==null || q==null || p.val!=q.val)return false;

        //recursively check if the left and right subtree are identical or not
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        
    }
}