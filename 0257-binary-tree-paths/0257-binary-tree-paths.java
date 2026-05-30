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
    private void DFS(TreeNode root,String path,List<String>res){
        if(root==null)return;
        path+=root.val;
        if(root.left==null && root.right==null){
            res.add(path);
        }
        else{
            path+="->";
            DFS(root.left,path,res);
            DFS(root.right,path,res);
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>res=new ArrayList<>();
        DFS(root,"",res);
        return res;
    }
}