class Solution {
	public:
		int atoi(const char *str) {
			if (str == nullptr) return 0;

			while (*str != 0 && isblank(*str)) {
				str++;
			}

			if (*str == 0) return 0;

			bool positive = true;
			if (*str == '-') {
				positive = false;
				str++;
			} else if (*str == '+') {
				str++;
			}

			long long result = 0;
			while (*str != 0 && isdigit(*str)) {
				result = result * 10 + (*str - '0');
				str++;
			}

			if (!positive) {
				result = -result;
			}

			if (result > INT_MAX) result = INT_MAX;
			if (result < INT_MIN) result = INT_MIN;

			return result;
		}
};
