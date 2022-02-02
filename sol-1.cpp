#include <bits/stdc++.h>
 
using namespace std;
 
int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	int n;
	cin >> n;
	string s[n];
	// choose the team with the highest frequency
	int mx = INT_MIN;
	map<string, int> mp;
	for (int i = 0; i < n; i++) {
		cin >> s[i];
		mp[s[i]]++;
		mx = max(mx, mp[s[i]]);
	}
	for (int i = 0; i < n; i++) {
		if (mp[s[i]] == mx) {
			cout << s[i] << '\n';
			break;
		}
	}
	return 0;
}
