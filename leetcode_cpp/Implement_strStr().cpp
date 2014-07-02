class Solution {
	public:
		char *strStr(char *haystack, char *needle) {
			if (*needle == 0) return haystack;
			if (*haystack == 0) return nullptr;

			while (*haystack) {
				bool match = true;
				char *tmp1 = haystack, *tmp2 = needle;
				while (*tmp2) {
					if (*tmp1 == 0) {
						return nullptr;
					}
					if (*tmp2 == *tmp1) {
						tmp2++;
						tmp1++;
					} else {
						match = false;
						break;
					}
				}
				if (match) {
					return haystack;
				}
				haystack++;
			}
		}
};
