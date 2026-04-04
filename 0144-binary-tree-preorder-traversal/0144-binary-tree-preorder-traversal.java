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
 //recursive
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer>ans=new ArrayList<>();
//         traversal(root,ans);
//         return ans;
//     }
//     private List<Integer> traversal(TreeNode root,List<Integer>ans){
//         if(root==null){
//             return ans;
//         }
//         ans.add(root.val);
//         traversal(root.left,ans);
//         traversal(root.right,ans);
//         return ans;

//     }
// }
//iterative
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>pre=new ArrayList<>();
        if(root==null)return pre;
        Stack<TreeNode>st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node=st.pop();
            pre.add(node.val);
            if(node.right!=null){
                st.push(node.right);
            }if(node.left!=null){
                st.push(node.left);
            }
        }
        return pre;
        
    }
}