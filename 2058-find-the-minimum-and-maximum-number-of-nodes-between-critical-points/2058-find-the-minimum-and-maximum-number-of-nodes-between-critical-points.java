/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int result[]={-1,-1};
        int minDistance=Integer.MAX_VALUE;
        ListNode prevNode=head;
        ListNode currNode=head.next;
        int currIdx=1;
        int prevCriticalIdx=0;
        int firstCriticalIdx=0;
        while(currNode.next!=null){
            if((currNode.val<prevNode.val && currNode.val<currNode.next.val) || (
               currNode.val>prevNode.val && currNode.val>currNode.next.val)){
                if(prevCriticalIdx==0){
                    prevCriticalIdx=currIdx;
                    firstCriticalIdx=currIdx;
                }else{
                    minDistance=Math.min(minDistance,
                                currIdx-prevCriticalIdx);
                                
                }
                prevCriticalIdx=currIdx;
            }
            currIdx++;
            prevNode=currNode;
            currNode=currNode.next;
        }
        if(minDistance!=Integer.MAX_VALUE){
            int maxDistance=prevCriticalIdx-firstCriticalIdx;
            result=new int[]{minDistance,maxDistance};
        }
        return result;
    }
}