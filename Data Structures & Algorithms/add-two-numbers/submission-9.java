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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

       ListNode f= l1;
       ListNode s= l2;

       ListNode head=null, last= null;
       int carry=0;

       while(f!=null || s!=null){
        int sum=carry;
        if(f!=null){
            sum +=f.val;
            f= f.next;
        }
        if(s!=null){
            sum += s.val;
            s=s.next;
        }
        int val=sum%10;
        carry=sum/10;

        if(head==null){
            head= new ListNode(val);
            last= head;
        }
        else{
            last.next=new ListNode(val);
            last= last.next;
        }
        if(carry>0){
            last.next= new ListNode(carry);
        }
       }
       return head;

        
    }
}
