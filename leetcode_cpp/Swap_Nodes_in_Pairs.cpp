class Solution {
	public:
		ListNode *swapPairs(ListNode *head) {
			ListNode result(0);
			result.next = head;

			ListNode *a = &result, *b, *c;
			while ((b = a->next) && (c = b->next)) {
				ListNode *d = c->next;
				a->next = c;
				c->next = b;
				b->next = d;
				a = b;
			}

			return result.next;
		}
};
