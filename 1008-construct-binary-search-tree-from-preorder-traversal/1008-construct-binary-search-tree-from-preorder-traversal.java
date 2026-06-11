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
    private TreeNode construct(TreeNode root,int val){
        if(root==null)return new TreeNode(val);
        if(root.val>val){
            root.left=construct(root.left,val);
        }else{
            root.right=construct(root.right,val);
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int n=preorder.length;
        if(n==0)return null;
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<n;i++){
            construct(root,preorder[i]);
        }
        return root;
    }
}