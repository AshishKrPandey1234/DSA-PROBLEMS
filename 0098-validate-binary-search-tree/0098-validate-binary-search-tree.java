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
    public boolean isValidBST(TreeNode root) {
        return isValid(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }
    //creates a range larger than every possible int. because what if any root is = minimum so stritctly smalled or greater rules fails so take limit out of integer limt
    
    public boolean isValid(TreeNode root,long minimum, long maximum){
        if(root==null)return true;
        if(!(root.val>minimum && root.val<maximum))return false;
        //in left side jo root node hai wo greater hoga pura left subtree se similarly in case of right subtree node.val (that is root.val) hai wo sabse chota hoga right subtree ke
        return isValid(root.left,minimum,root.val) && isValid(root.right,root.val,maximum);
    }
}