/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode list) {
       if (list == null) return null; // first question

    if (list.next == null) return list; // second question

    // third question - in Lisp this is easy, but we don't have cons
    // so we grab the second element (which will be the last after we reverse it)

    ListNode secondElem = list.next;

    // bug fix - need to unlink list from the rest or you will get a cycle
    list.next = null;

    // then we reverse everything from the second element on
    ListNode reverseRest = reverseList(secondElem);

    // then we join the two lists
    secondElem.next = list;

    return reverseRest;
    }
}


class Solution {
    public ListNode reverseList(ListNode head) {
     ListNode newHead = null;
         while(head!=null){
             ListNode next = head.next;
             head.next = newHead;
             newHead = head;
             head = next;
         }
    return newHead;
    }
}
