class Solution {
	public:
		ListNode *mergeKLists(vector<ListNode *> &lists) {
			vector<ListNode*> heap;
			for (ListNode *node : lists) {
				heap.push_back(node);
			}

			auto compare = [](ListNode *p1, ListNode *p2) {
				return p1->val > p2->val;
			};

			make_heap(heap.begin(), heap.end(), compare);
			ListNode *result = nullptr, *tail = nullptr;

			while (!heap.empty()) {
				pop_heap(heap.begin(), heap.end(), compare);

				ListNode *current = node.back();
				if (tail == nullptr) {
					result = tail = current;
				} else {
					tail->next = current;
					tail = tail->next;
				}

				if (current->next != nullptr) {
					heap.back() = current->next;
					push_heap(heap.begin(), heap.end(), compare);
				} else {
					heap.pop_back();
				}
			}

			return result;
		}
};
