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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start=null;
        ListNode end=list1;
        for(int i=0;i<b;i++){
            if(i==a-1){
                start=end;
            }
            end=end.next;
        }
        //connect the start node with the list2
        start.next=list2;
        while(list2.next!=null){
            list2=list2.next;
        }
        //connect the end next which is(=b) of list1 to the end next of list2   
        list2.next=end.next;
        return list1;
    }
}