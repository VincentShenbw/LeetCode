class Solution {
	public:
		vector<vector<int> > threeSum(vector<int> &num) {
			sort(num.begin(), num.end());

			vector<vector<int>> result;
			for (int k = 0; k < num.size(); k++) {
				int target = num[k];
				while (k < num.size() && num[k] == target) k++;

				k--;
				target = -target;
				int i = 0, j = k - 1;
				while (i < j) {
					int sum = num[i] + num[j];
					if (sum == target) {
						vector<int> tmp{num[i], num[j], num[k]};
						result.push_back(tmp);
						if (num[i] != num[j]) {
							int t1 = i, t2 = j;
							while (t1 < j && num[t1] == num[i]) t1++;
							while (t2 > i && num[t2] == num[j]) t2--;
							i = t1;
							j = t2;
						} else {
							break;
						}
					} else if (sum < target) {
						i++;
					} else {
						j--;
					}
				}
			}
			return result;
		}
};
