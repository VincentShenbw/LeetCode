class Solution {
	public:
		double findMedianSortedArrays(int A[], int m, int B[], int n) {
			if ((m + n) % 2 == 0) {
				return (findK(A, m, B, n, (m + n) / 2) + findK(A, m, B, n, (m + n) / 2 + 1)) / 2.0;
			} else {
				return findK(A, m, B, n, (m + n + 1) / 2);
			}
		}

		int findK(int A[], int m, int B[], int n, int k) {
			if (m < n) return findK(B, n, A, m, k);
			if (n == 0) return A[k - 1];

			if (k == 1) return min(A[0], B[0]);
			int bpos = min(k / 2, n);
			int apos = k - bpos;
			bpos--;
			apos--;

			if (A[apos] < B[bpos]) {
				return findK(A + apos + 1, m - apos - 1, B, n, k - apos - 1);
			} else if (A[apos] > B[bpos]) {
				return findK(A, m, B + bpos + 1, n - bpos - 1, k - bpos - 1);
			} else {
				return A[apos];
			}
		}
};
