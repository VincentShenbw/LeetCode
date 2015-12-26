/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null||k==0)
        {
            return head;
        }
        ListNode node = head;
        int len = 0;
        while (node!=null)
        {
            len++;
            node = node.next;
        }
        k = k%len;
        if (k==0)
        {
            return head;
        }
        int tmp = len-k;
        node = head;
        while(tmp>1)
        {
            node = node.next;
            tmp--;
        }
        ListNode nodet = node.next;
        node.next = null;
        ListNode nodett = nodet;
        while(nodett.next!=null)
        {
            nodett = nodett.next;
        }
        nodett.next = head;
        head = nodet;
        return head;
    }
}