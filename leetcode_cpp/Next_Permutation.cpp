class Solution {
	public:
		void nextPermutation(vector<int> &num) {
			if (is_sorted(num.begin(), num.end(), greater<int>())) {
				reverse(num.begin(), num.end());
				return;
			}

			int k;
			for (k = num.size() - 1; k > 0; k--) {
				if (num[k] > num[k - 1]) break;
			}

			int minv = num[k], minp = k;
			for (int t = k + 1; t < num.size(); t++) {
				if (num[t] > num[k - 1] && num[t] <= minv) {
					minv = num[t];
					minp = t;
				}
			}

			swap(num[k - 1], num[minp]);
			reverse(num.begin() + k, num.end());
			return;
		}
};
