class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int rank[]=new int[n];
        int temp[]=arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int r=1;
        for(int i=0;i<n;i++){
            if(i>0 && temp[i]!=temp[i-1]){
                r++;
            }
            mpp.put(temp[i],r);
        }
        for(int i=0;i<n;i++){
            rank[i]=mpp.get(arr[i]);
        }
        return rank;

    }
}