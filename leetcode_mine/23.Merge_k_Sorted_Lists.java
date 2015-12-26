/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null||lists.length==0)
        {
            return null;
        }
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(1, new Comparator<ListNode>(){
            public int compare(ListNode l1, ListNode l2)
            {
                if (l1.val<l2.val)
                {
                    return -1;
                }
                else if (l1.val==l2.val)
                {
                    return 0;
                }
                else
                {
                    return 1;
                }
            }
        });
        for (ListNode node : lists)
        {
            if (node!=null)
            {
                queue.add(node);
            }
        }
        ListNode head =  new ListNode(0);
        ListNode tail = head;
        while (!queue.isEmpty())
        {
            ListNode tmp = queue.poll();
            tail.next = tmp;
            if (tmp.next!=null)
            {
                queue.add(tmp.next);
            }
            tail = tail.next;
        }
        return head.next;
    }
}