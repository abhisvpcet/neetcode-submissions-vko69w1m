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
    public void reorderList(ListNode head) {

        if(head==null || head.next==null){
            return;
        }
        //find the middle of the list
        ListNode slow= head;
        ListNode fast= head;

        while(fast.next!=null && fast.next.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        //split the list into two halves
        ListNode secondHalf= slow.next;
        slow.next=null;

        //reverse the second half
        secondHalf=reverse(secondHalf);

        //merge the 1st half with the reversed second half
        ListNode current=head;
        while(secondHalf!=null){
            ListNode nextFirst=current.next;
            ListNode nextSecond= secondHalf.next;

            current.next=secondHalf;
            secondHalf.next=nextFirst;
            current= nextFirst;
            secondHalf = nextSecond;
        }
    }

    //helper function to reverse the list
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current= head;
        while(current!=null){
            ListNode nextNode=current.next;
            current.next=prev;
            prev=current;
            current= nextNode;
        }
        return prev;
    }
}
