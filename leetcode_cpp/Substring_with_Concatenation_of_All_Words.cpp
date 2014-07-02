class Solution {
	public:
		vector<int> findSubstring(string S, vector<string> &L) {
			unordered_map<string, int> target;
			for (const string &s : L) {
				target[s]++;
			}

			vector<int> result;
			unordered_map<string, int> occur;
			if (L.size() == 0) return result;
			int word_length = L[0].length();

			for (int t = 0; t < word_length; t++) {
				int total = 0;
				for (int s = t, start; s <= (int)S.length() - word_length; s += word_length) {
					if (total == 0) {
						start = s;
						occur.clear();
					}

					string current = S.substr(s, word_length);
					if (target.count(current) == 0) {
						total = 0;
					} else {
						if (occur[current] < target[current]) {
							total++;
							occur[current]++;
							if (total == L.size()) {
								result.push_back(start);
								occur[S.substr(start, word_length)]--;
								start += word_length;
								total--;
							}
						} else {
							while (S.substr(start, word_length) != current) {
								total--;
								occur[S.substr(start, word_length)]--;
								start += word_length;
							}
							start += word_length;
						}
					}
				}
			}

			return result;
		}
};
