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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode node=head;
        int size=0;
        while(node!=null){
            size++;
            node=node.next;   
        }
        int arr[]=new int[size];
        int i=0;
        node=head;
        while(node!=null){
            arr[i++]=node.val;
            node=node.next;
        }
        k=k%size;
        int rotated[]=new int[size];
        for(i=0;i<size;i++){
            rotated[(i+k)%size]=arr[i];   
        }
        node =head;
        i=0;
        while(node!=null){
            node.val=rotated[i++];
            node=node.next;
        }
        return head;

    }
}