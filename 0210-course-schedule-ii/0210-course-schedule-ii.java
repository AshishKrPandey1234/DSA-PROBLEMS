class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //topo sort using dfs
        //as topo sort is applicable in directed acyclic graph
        //numCourses=V(number of node) 
        //prerequisite is edges
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            adj.get(v).add(u);
            //as topo sort is applicable in directed acyclic graph
        }
        boolean vis[]=new boolean[numCourses];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<numCourses;i++){
            if(!vis[i]){
                DFS(i,adj,vis,st);
            }
        }
        int ans[]=new int[numCourses];
        int i=0;
        while(!st.isEmpty()){
            ans[i++]=st.pop();
            
        }
        return ans;
    }
    private void DFS(int node,List<List<Integer>>adj,boolean vis[],Stack<Integer>st){
        vis[node]=true;
        for(int nbr:adj.get(node)){
            if(!vis[nbr]){
                DFS(nbr,adj,vis,st);
            }
        }
        st.push(node);
    }
}