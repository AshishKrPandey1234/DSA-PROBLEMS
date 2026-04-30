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
    public int goodNodes(TreeNode root) {
        int max=Integer.MIN_VALUE;
        return DFS(root,max);
    }
    private int DFS(TreeNode root, int max){
        int goodCount=0;
        if(root==null)return 0;
        if(root.val>=max){
            goodCount++;
        }
        goodCount+=DFS(root.left,Math.max(max,root.val));
        goodCount+=DFS(root.right,Math.max(max,root.val));
        return goodCount;
    }
}