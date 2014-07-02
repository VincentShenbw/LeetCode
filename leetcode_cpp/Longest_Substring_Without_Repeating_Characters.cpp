class Solution {
	public:
		int lengthOfLongestSubstring(string s) {
			int maxLength = 0;
			unordered_set<char> occured;

			int p = 0, q = 0;
			while (p < s.length()) {
				if (!occured.insert(s[p]).second) {
					maxLength = max(maxLength, p - q);
					while (s[q] != s[p]) {
						occured.erase(s[q]);
						q++;
					}
					q++;
				}
				p++;
			}

			maxLength = max(maxLength, p - q);
			return maxLength;
		}
};
