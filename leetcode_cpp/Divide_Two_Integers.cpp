class Solution {
	public:
		int divide(int dividend, int divisor) {
			bool sign = (dividend < 0) ^ (divisor < 0);
			long long a = abs((long long)dividend);
			long long b = abs((long long)divisor);

			long long result = 0;
			while (a >= b) {
				long long c = b;
				long long t = 1;
				while (a >= c) {
					t += t;
					c += c;
				}

				result += (t >> 1);
				a -= (c >> 1);
			}

			return sign ? -result : result;
		}
};
