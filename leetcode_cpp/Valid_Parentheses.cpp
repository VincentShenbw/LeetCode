class Solution {
	public:
		bool isValid(string s) {
			stack<char> leftPart;
			for (char c : s) {
				if (isLeft(c)) {
					leftPart.push(c);
				} else {
					if (leftPart.empty() || !match(c, leftPart.top())) {
						return false;
					} else {
						leftPart.pop();
					}
				}
			}
			return leftPart.empty();
		}

		bool match(char right, char left) {
			return (right == ')' && left == '(') ||
				(right == ']' && left == '[') ||
				(right == '}' && left == '{');
		}

		bool isLeft(char c) {
			return c == '(' || c == '{' || c == '[';
		}
};
