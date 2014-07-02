class Solution {
	public:
		vector<vector<int> > fourSum(vector<int> &num, int target) {
			sort(num.begin(), num.end());

			vector<vector<int>> result;
			for (int i = 0; i < num.size(); i++)
				for (int j = i + 1; j < (int)num.size() - 2; j++) {
					int t = target - num[i] - num[j];

					int p = j + 1, q = num.size() - 1;
					while (p < q) {
						int sum = num[p] + num[q];
						if (sum == t) {
							vector<int> newResult{num[i], num[j], num[p], num[q]};
							result.push_back(newResult);
							p++;
							q--;
						} else if (sum < t) {
							p++;
						} else {
							q--;
						}
					}
				}

			sort(result.begin(), result.end());
			result.erase(unique(result.begin(), result.end()), result.end());
			return result;
		}
};
