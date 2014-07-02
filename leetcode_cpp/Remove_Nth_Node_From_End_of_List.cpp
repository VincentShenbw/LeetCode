class Solution {
	public:
		ListNode *removeNthFromEnd(ListNode *head, int n) {
			if (head == nullptr) return head;

			ListNode *p = head, *q = head;
			while (n-- != 0) q = q->next;
			if (q == nullptr) {
				return head->next;
			}

			while (q->next != nullptr) {
				p = p->next;
				q = q->next;
			}

			p->next = p->next->next;
			return head;
		}
};
