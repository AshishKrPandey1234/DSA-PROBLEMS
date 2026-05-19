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
        //case 1: if both node 
        if(p==null && q==null) return true;
        //case 2: if any one of them is null other 
        if(p==null || q == null)return false;

        return ((p.val==q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
    }
}