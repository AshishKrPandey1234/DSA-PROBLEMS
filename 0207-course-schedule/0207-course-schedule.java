class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int V=numCourses;
        int topo[]=new int[V];
        //step 1:Create adjacency list
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            adj.get(v).add(u);
        }

        //step 2 create indegree
        int indegree[]=new int[V];
        for(int i=0;i<V;i++){
            for(int nbr:adj.get(i)){
                indegree[nbr]++;
            }
        }

        //step 2:whose indegree is 0 add it to queue as if it will be acyclic than atleast one of the node would have indegree =0
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        //in almost every question as u insert anything inside queue or stack next step is to empty the queue and try to make the answer 
        int i=0;
        
        while(!q.isEmpty()){
            int node =q.poll();
            topo[i++]=node;
            for(int nbr: adj.get(node)){
                indegree[nbr]--;
                //if indegree neighbour become 0 at that time add it to queue
                if(indegree[nbr]==0){
                    q.add(nbr);
                }
            }
        }
        //if there is no cycle than all the element indegree will become 0 at any point so this way it will be added in the answer that is topo array if not added it means someone have indegree !=0 so not gone in q and this q not removed anything (jab q mai gaya hi nahi toh kya nikalega) so this way topo array index will not reach up to last index that is upto size so this way 
        //// V is number of nodes (say 5). Indexing in topo is 0 to 4, but we insert using topo[i++].
// After inserting the last element at index 4, i++ makes i = 5. So i == V means all nodes were processed.
        if(i==V)return true;
        return false;
    }
}