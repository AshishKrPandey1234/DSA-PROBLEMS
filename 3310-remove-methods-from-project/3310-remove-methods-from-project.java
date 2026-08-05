class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer>[]edges=new ArrayList[n];
        for(int i=0;i<n;i++){
            edges[i]=new ArrayList<>();
        }
        int inDegree[]=new int[n];
        for(int inv[]:invocations){
            edges[inv[0]].add(inv[1]);
            inDegree[inv[1]]++;
        }
        Queue<Integer>q=new ArrayDeque<>();
        q.offer(k);
        boolean suspicious[]=new boolean[n];
        suspicious[k]=true;
        while(!q.isEmpty()){
            int u=q.poll();
            for(int v:edges[u]){
                inDegree[v]--;

                if(!suspicious[v]){
                    q.offer(v);
                    suspicious[v]=true;
                }
            }
        }
        boolean canRemoveAll=true;
        List<Integer>remaining=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(suspicious[i] && inDegree[i]>0){
                canRemoveAll=false;
                break;
            }else if(!suspicious[i]){
                remaining.add(i);
            }
        }
        if(!canRemoveAll){
            List<Integer>allNodes=new ArrayList<>(n);
            for(int i=0;i<n;i++){
                allNodes.add(i);
            }
            return allNodes;
        }
        return remaining;

    }
}