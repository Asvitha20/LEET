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
    public int length(ListNode head){
        ListNode dummy=head;
        int count=0;
        while(dummy!=null){
            dummy=dummy.next;
            count++;
        }
        return count;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head==null) return head;
        if(head.next==null) return null;
        int i=0;
        int len=length(head);
        int mid=len/2;
        ListNode dummy=head;
        ListNode dummy1=null;
        while(dummy.next!=null && i<mid){
            dummy1=dummy;
            dummy=dummy.next;
            i++;
        }
        dummy1.next=dummy.next;
        dummy.next=null;
        return head;
    }
}