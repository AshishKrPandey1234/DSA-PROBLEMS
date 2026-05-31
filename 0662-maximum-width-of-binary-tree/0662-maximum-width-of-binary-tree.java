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
 class Pair{
    TreeNode node;
    int idx;
    Pair(TreeNode node,int idx){
        this.node=node;
        this.idx=idx;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0));
        int maxW=0;
        while(!q.isEmpty()){
            int size=q.size();
            int minIndex=q.peek().idx;
            int first=0,last=0;
            for(int i=0;i<size;i++){
                Pair p=q.poll();
                TreeNode node=p.node;
                int currIdx=p.idx-minIndex; 
                if(i==0){
                    first=currIdx;
                }
                if(i==size-1){
                    last=currIdx;
                }
                if(node.left!=null){
                    q.offer(new Pair(node.left,2*currIdx+1));
                }
                if(node.right!=null){
                    q.offer(new Pair(node.right,2*currIdx+2));
                }
                
            }
            maxW=Math.max(maxW,last-first+1);
        }
        return maxW;
    }

}