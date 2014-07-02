class Solution {
	public:
		void findMore(string &digits, int step, vector<string> &answers, string &current) {
			static string mappings[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

			if (step == digits.length()) {
				answers.push_back(current);
			} else {
				string &candidates = mappings[digits[step] - '0'];
				for (char c : candidates) {
					current += c;
					findMore(digits, step + 1, answers, current);
					current.pop_back();
				}
			}
		}

		vector<string> letterCombinations(string digits) {
			string current;
			vector<string> answers;
			findMore(digits, 0, answers, current);
			return answers;
		}
};
