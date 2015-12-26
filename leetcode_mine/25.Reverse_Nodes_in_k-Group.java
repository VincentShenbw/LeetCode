/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head==null||k==1||head.next==null)
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
        int mul = len/k;
        if (mul==0)
        {
            return head;
        }
        ListNode pre = null;
        node = head;
        ListNode tail = node;
        ListNode next = head.next;
        node.next = null;
        for (int i = 0; i<mul; i++)
        {
            for (int j = 1; j<k; j++)
            {
                ListNode tmp = next.next;
                next.next = node;
                if (pre!=null)
                {
                    pre.next = next;
                }
                node = next;
                next = tmp;
            }
            if (i==0)
            {
                head = node;
            }
            if (i!=mul-1)
            {
                pre = tail;
                node = next;
                tail = node;
                next = node.next;
                node.next = null;
            }
            else
            {
                if (next!=null)
                {
                    tail.next = next;
                }
            }
        }
        return head;
    }
}