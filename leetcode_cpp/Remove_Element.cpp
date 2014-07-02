class Solution {
	public:
		int removeElement(int A[], int n, int elem) {
			int s = 0;
			for (int k = 0; k < n; k++) {
				if (A[k] != elem) {
					swap(A[k], A[s]);
					s++;
				}
			}
			return s;
		}
};
