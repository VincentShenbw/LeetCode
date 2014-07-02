class Solution {
	public:
		int threeSumClosest(vector<int> &num, int target) {
			sort(num.begin(), num.end());

			int minValue = INT_MAX, minSum;
			for (int k = 0; k < num.size(); k++) {
				int i = 0, j = k - 1;
				while (i < j) {
					int sum = num[i] + num[j] + num[k];
					if (abs(sum - target) < minValue) {
						minValue = abs(sum - target);
						minSum = sum;
					}

					if (sum == target) {
						return target;
					} else if (sum < target) {
						i++;
					} else {
						j--;
					}
				}
			}
			return minSum;
		}
};
