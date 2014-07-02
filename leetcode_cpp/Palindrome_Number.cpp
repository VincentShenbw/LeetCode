class Solution {
	public:
		bool isPalindrome(int x) {
			if (x < 0) return false;
			long long p = x, q = 0;
			while (x != 0) {
				q = q * 10 + x % 10;
				x /= 10;
			}
			return p == q;
		}
};
