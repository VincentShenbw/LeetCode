class Solution {
	public:
		string longestPalindrome(string s) {
			string result;
			int maxLength = 0, t;
			for (int k = 0; k < s.length(); k++) {
				t = detect(s, k - 1, k + 1, 1);
				if (t > maxLength) {
					maxLength = t;
					result = s.substr(k - t / 2, t);
				}

				if (k == s.length() - 1) continue;
				t = detect(s, k, k + 1, 0);
				if (t > maxLength) {
					maxLength = t;
					result = s.substr(k - t / 2 + 1, t);
				}
			}
			return result;
		}

		int detect(string &s, int left, int right, int base) {
			int result = base;
			while (left >= 0 && right < s.length()) {
				if (s[left] == s[right]) {
					result += 2;
					right++;
					left--;
				} else {
					break;
				}
			}
			return result;
		}
};
