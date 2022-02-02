#include <bits/stdc++.h>
 
using namespace std;
 
int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	int n;
	cin >> n;
	string s[n];
	// choose the team with the highest frequency
	string team1 = "";
	string team2 = "";
	for (int i = 0; i < n; i++) {
		cin >> s[i];
		if (team1 == "") {
			team1 = s[i];
		} else if (s[i] != team1) {
			team2 = s[i];
		}
	}
	int cnt = 0;
	for (int i = 0; i < n; i++){ 
		cnt += (s[i] == team1);
	}
	if (cnt > n - cnt) {
		cout << team1;
	} else {
		cout << team2;
	}
	cout << '\n';
	return 0;
}
