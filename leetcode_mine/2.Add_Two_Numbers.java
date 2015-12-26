/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null&&l2==null)
        {
            return null;
        }
        if (l1==null)
        {
            return l2;
        }
        if (l2==null)
        {
            return l1;
        }
        ListNode l = new ListNode(0);
        ListNode re = l;
        int p = 0;
        while(l1!=null&&l2!=null)
        {
            int val = l1.val+l2.val+p;
            if (val>=10)
            {
                val = val-10;
                p = 1;
            }
            else
                p = 0;
            l.next = new ListNode(val);
            l1 = l1.next;
            l2 = l2.next;
            l = l.next;
        }
        if (l1==null&&l2==null&&p!=0)
        {
            l.next = new ListNode(p);
        }
        if (l1!=null) l.next = l1;
        if (l2!=null) l.next = l2;
        while (l1!=null)
        {
            if (p==0) {
                break;
            }
            else
            {
                l1.val += p;
                if (l1.val==10)
                {
                    l1.val = l1.val-10;
                    p = 1;
                    if (l1.next==null){
                    	l1.next = new ListNode(0);
                    	l1 = l1.next;
                    }
                    else
                    {
                    	l1 = l1.next;
                    }
                }
                else {
                    p = 0;
                    break;
                }
            }
        }
        while (l2!=null)
        {
            if (p==0) {
                break;
            }
            else
            {
                l2.val += p;
                if (l2.val==10)
                {
                    l2.val = l2.val-10;
                    p = 1;
                    if (l2.next==null){
                    	l2.next = new ListNode(0);
                    	l2 = l2.next;
                    }
                    else
                    {
                    	l2 = l2.next;
                    }
                }
                else {
                    p = 0;
                    break;
                }
            }
        }
        return re.next;
    }
}