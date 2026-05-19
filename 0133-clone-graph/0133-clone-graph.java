/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public void DFS(Node node,Node copy,Node[] vis){
        vis[copy.val]=copy;//store the cloned graph in the visited
        for(Node n:node.neighbors){
            if(vis[n.val]==null){
                Node newNode=new Node(n.val);
                copy.neighbors.add(newNode);
//                 make dfs call for this unvisited node to discover whether it's adjacent nodes are explored or not
                DFS(n , newNode , vis);
            }else{
//                 if that node is already visited, retrieve that node from visited array and add it as the adjacent node of prev copied node
//                 THIS IS THE POINT WHY WE USED NODE[] INSTEAD OF BOOLEAN[] ARRAY
                copy.neighbors.add(vis[n.val]);
            }
        }      
    }
    public Node cloneGraph(Node node) {
        if(node==null)return null;//if actual node is empty than  we have nothing to copy
        Node copy=new Node(node.val);//
        Node vis[]=new Node[101];
        Arrays.fill(vis,null);
        DFS(node,copy,vis);
        return copy;
    }
}