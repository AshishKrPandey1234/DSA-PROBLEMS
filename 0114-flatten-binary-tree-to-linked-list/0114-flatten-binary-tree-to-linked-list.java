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
    List<TreeNode>list=new ArrayList<>();
    public void flatten(TreeNode root) {
        preorder(root);
        int size=list.size();
        if(size==0)return;
        for(int i=0;i<size-1;i++){
            TreeNode curr=list.get(i);
            TreeNode next=list.get(i+1);
            curr.left=null;
            curr.right=next;
            //curr=next;
        }
        
        
    }
    public void preorder(TreeNode root){
        if(root==null)return;
        list.add(root);
        preorder(root.left);
        preorder(root.right);
    }
}