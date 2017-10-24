/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode p = head;
        ListNode q = head.next;
        while(q!=null){
     	 	while (q.val == p.val && q.next!=null){q=q.next;}
                        if (q.val==p.val && q.next==null){p.next=null; return head;}
                        else{
         		p.next = q;
         		p = q;
        		q=q.next;
}
        	}
       return head;
    }

    public ListNode deleteDuplicates(ListNode head){
		if(head==null || head.next==null) return head;
                head.next = deleteDuplicates(head.next);
                return head.val==head.next.val? head.next : head;
	}
}
