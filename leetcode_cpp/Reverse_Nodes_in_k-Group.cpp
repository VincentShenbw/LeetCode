class Solution {
	public:
		ListNode *reverseKGroup(ListNode *head, int k) {
			if (k == 1 || head == nullptr) return head;

			ListNode result(0);
			ListNode *e = &result, *s;
			result.next = head;

			while (e != nullptr) {
				s = e;
				for (int t = 0; t < k; t++) {
					if (e->next == nullptr) {
						return result.next;
					} else {
						e = e->next;
					}
				}

				ListNode *prev = e->next;
				ListNode *p = s->next;
				while (p != e) {
					ListNode *next = p->next;
					p->next = prev;
					prev = p;
					p = next;
				}

				e = s->next;
				p->next = prev;
				s->next = p;
			}
		}
};
