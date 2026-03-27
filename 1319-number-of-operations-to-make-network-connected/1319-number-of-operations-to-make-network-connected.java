class DisJointSet{
    List<Integer>parent=new ArrayList<>();
    List<Integer>size=new ArrayList<>();
    public DisJointSet(int n){
        for(int i=0;i<n;i++){
            parent.add(i);//in starting all are the parents of itself
            size.add(1);//and all of them have size 1
        }
    }
    //find the ultimate parent
    public int ulPar(int node){
        if(parent.get(node)==node){
            return node;//if node is its own parent it is leader
        }
        int ulp=ulPar(parent.get(node));
        //path compression : directly connect node to ultimate parent
        parent.set(node,ulp);
        return parent.get(node);
    }
    public void unionBySize(int u,int v){
        int ulp_u=ulPar(u);
        int ulp_v=ulPar(v);
        //if both belong to same component do nothing
        if(ulp_u==ulp_v)return;
        //attach smaller tree under larger
        if(size.get(ulp_u)>size.get(ulp_v)){
            parent.set(ulp_v,ulp_u);//attach v root to u root
            size.set(ulp_u,size.get(ulp_u)+size.get(ulp_v));
        }else{
            parent.set(ulp_u,ulp_v);//attach u root to v
            size.set(ulp_v,size.get(ulp_v)+size.get(ulp_u));
            
        }
    }
}
class Solution {
    public int makeConnected(int n, int[][] connections) {
        DisJointSet ds=new DisJointSet(n);
        int cntExtraEdges=0;
        for(int i=0;i<connections.length;i++){
            int u=connections[i][0];
            int v=connections[i][1];
            //when node and its adjNode have same parent for example[0,1],[0,2], now see 0 is ultimate parent of 1 and 2 but come to edge[1,2] here node =1 and adjNode=2 both have ultimate parent 0 so it will be counted as one extra edge
            if(ds.ulPar(u)==ds.ulPar(v)){
                cntExtraEdges++;
            }else{
                ds.unionBySize(u,v);
            }
        }
        int cntComp=0;
        for(int i=0;i<n;i++){
            //if anyone is parent of itself it means there is different connected component
            if(ds.parent.get(i)==i)cntComp++;
        }
        int requiredEdges=cntComp-1;//as per MST
        if(cntExtraEdges>=requiredEdges)return requiredEdges;
        return -1;
    }
}