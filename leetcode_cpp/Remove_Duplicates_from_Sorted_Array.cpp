class Solution {
	public:
		int removeDuplicates(int A[], int n) {
			if (n == 0) return 0;

			int position = 0;
			for (int k = 0; k < n; k++) {
				if (A[k] != A[position]) {
					A[++position] = A[k];
				}
			}
			return position + 1;
		}
};
