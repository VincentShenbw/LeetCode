/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode s = head;
        for (int i = 1; i<n; i++)
        {
            s = s.next;
        }
        ListNode node = head;
        ListNode pre = null;
        int count = 0;
        while (s.next!=null)
        {
            if (count==0)
            {
                pre = head;
            }
            else
            {
                pre = pre.next;
            }
            s = s.next;
            node = node.next;
            count++;
        }
        if (pre!=null){
            pre.next = node.next;
        }
        else{
            if (node.next==null)
                head = null;
            else
                head = node.next;
        }
        
        return head;
    }
}