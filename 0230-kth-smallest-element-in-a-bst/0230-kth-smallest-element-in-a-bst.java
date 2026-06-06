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
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return -1;
        int leftSubTree= kthSmallest(root.left,k);
        if(leftSubTree!=-1) return leftSubTree;
        count++;
        if(count==k) return root.val;
        int rightSubTree= kthSmallest(root.right,k);
        if(rightSubTree!=-1) return rightSubTree;
        return -1;

    }
}