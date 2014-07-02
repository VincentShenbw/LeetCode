class Solution {
	public:
		string longestCommonPrefix(vector<string> &strs) {
			if (strs.empty()) return "";

			int max_length = strs[0].length();
			for (int k = 1; k < strs.size(); k++) {
				max_length = min(max_length, (int)strs[k].length());
			}

			for (int k = 0; k < max_length; k++) {
				bool same = true;
				for (int p = 1; p < strs.size(); p++) {
					if (strs[p][k] != strs[0][k]) {
						same = false;
					}
				}
				if (!same) return strs[0].substr(0, k);
			}

			return strs[0].substr(0, max_length);
		}
};
