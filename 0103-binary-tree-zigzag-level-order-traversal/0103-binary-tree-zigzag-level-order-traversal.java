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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();//ans array
        if(root==null)return ans;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        boolean flag=true;//it goes from left to right in case true and vice-versa
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>nestedList=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node =q.poll();
                if(flag)nestedList.add(node.val);
                else nestedList.add(0,node.val);
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            ans.add(nestedList);
            flag=!flag;
        }
        return ans;
    }
}