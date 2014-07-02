class Solution {
	public:
		int romanToInt(string s) {
			map<char, int> convertMap{
				{'M', 1000}, {'D', 500}, {'C', 100}, {'L', 50}, {'X', 10}, {'V', 5}, {'I', 1}
			};

			int result = 0;
			for (int k = 0; k < s.length(); k++) {
				int value = convertMap[s[k]];
				if (k != s.length() - 1 && value < convertMap[s[k + 1]]) {
					result -= value;
				} else {
					result += value;
				}
			}
			return result;
		}
};
