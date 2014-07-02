class Solution {
	public:
		vector<string> generateParenthesis(int n) {
			string current;
			vector<string> results;
			generateRecursive(n, 0, 0, 0, current, results);
			return results;
		}

		void generateRecursive(int n, int level, int left, int right, string &current, vector<string> &result) {
			if (level == 2 * n) {
				result.push_back(current);
				return;
			}

			if (left < n) {
				current.push_back('(');
				generateRecursive(n, level + 1, left + 1, right, current, result);
				current.pop_back();
			}

			if (right < left) {
				current.push_back(')');
				generateRecursive(n, level + 1, left, right + 1, current, result);
				current.pop_back();
			}
		}
};
