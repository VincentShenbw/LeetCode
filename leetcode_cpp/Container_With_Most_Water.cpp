class Solution {
	public:
		int maxArea(vector<int> &height) {
			int result = 0;
			int p = 0, q = (int)height.size() - 1;
			while (p < q) {
				result = max(result, (q - p) * min(height[p], height[q]));
				if (height[p] < height[q]) {
					p++;
				} else {
					q--;
				}
			}
			return result;
		}
};
