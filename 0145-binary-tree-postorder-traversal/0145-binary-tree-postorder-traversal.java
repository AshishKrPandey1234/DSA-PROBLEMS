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
// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer>ans=new ArrayList<>();
//         helper(root,ans);
//         return ans;
//     }
//     private List<Integer>helper(TreeNode root,List<Integer>ans){
//         if(root==null)return ans;
//         //LC-RC-root
//         helper(root.left,ans);
//         helper(root.right,ans);
//         ans.add(root.val);
//         return ans;
//     }
// }
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        if(root==null)return ans;
        Stack<TreeNode>st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node=st.pop();
            ans.add(node.val);
            if(node.left!=null)st.push(node.left);
            if(node.right!=null)st.push(node.right);
        }
        Collections.reverse(ans);
        return ans;
    }
}