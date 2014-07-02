class Solution {
	public:
		ListNode *addTwoNumbers(ListNode *l1, ListNode *l2) {
			if (l1 == nullptr) return l2;
			if (l2 == nullptr) return l1;

			int carry = 0;
			ListNode *tail = nullptr;
			ListNode *result = nullptr;
			while (l1 != nullptr || l2 != nullptr) {
				ListNode *t = new ListNode(getValueThenMove(l1) + getValueThenMove(l2) + carry);
				carry = getCarryThenCut(t->val);

				if (tail == nullptr) {
					result = tail = t;
				} else {
					tail->next = t;
					tail = t;
				}
			}

			if (carry == 1) {
				tail->next = new ListNode(1);
			}

			return result;
		}

		int getValueThenMove(ListNode *&p) {
			if (p == nullptr) return 0;
			int result = p->val;
			p = p->next;

			return result;
		}

		int getCarryThenCut(int &sum) {
			int carry = sum / 10;
			sum = sum % 10;
			return carry;
		}
};
