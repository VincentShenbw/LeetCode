class Solution {
	public:
		string convert(string s, int nRows) {
			if (nRows == 1) return s;

			string result;
			int gap1 = 2 * (nRows - 1), gap2 = 0;
			for (int k = 0; k < nRows; k++) {
				if (k == 0 || k == nRows - 1) {
					fill(s, result, k, 2 * (nRows - 1), 2 * (nRows - 1));
				} else {
					fill(s, result, k , gap1, gap2);
				}
				gap1 -= 2;
				gap2 += 2;
			}

			return result;
		}

		void fill(string &s, string &result, int p, int gap1, int gap2) {
			bool first = true;
			while (p < s.length()) {
				result += s[p];
				p += first ? gap1 : gap2;
				first = !first;
			}
		}
};
