
class Solution {
	public:
		bool isMatch(const char *s, const char *p) {
			if (*p == 0) return *s == 0;

			if (*(p + 1) == '*') {
				while ((*p == '.' && *s) || *s == *p) {
					bool result = isMatch(s, p + 2);
					if (result) return true;
					s++;
				}
				return isMatch(s, p + 2);
			} else {
				if ((*p == '.' && *s) || *s == *p) {
					return isMatch(s + 1, p + 1);
				} else {
					return false;
				}
			}
		}
};
