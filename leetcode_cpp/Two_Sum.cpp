class Solution {
	public:
		vector<int> twoSum(vector<int> &numbers, int target) {
			vector<pair<int, int>> data;
			for (int k = 0; k < numbers.size(); k++) {
				data.emplace_back(numbers[k], k);
			}
			sort(data.begin(), data.end());

			int i = 0, j = numbers.size() - 1;
			while (i != j) {
				int sum = data[i].first + data[j].first;
				if (sum > target) {
					j--;
				} else if (sum < target) {
					i++;
				} else {
					pair<int, int> index = minmax(data[i].second, data[j].second);
					return vector<int>{index.first + 1, index.second + 1};
				}
			}
		}
};
