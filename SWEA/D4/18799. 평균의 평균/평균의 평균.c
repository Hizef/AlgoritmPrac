// 2023 11 19

#include <stdio.h>

int tc, T;

int main() {
	scanf("%d ", &T);
	for (tc = 1; tc <= T; ++tc) {
		int n; // 집합의 크기
		scanf("%d ", &n);
		int s[8] = { 0 }; // 집합 S
		int sum = 0;
		for (int i = 0; i < n; i++) {
			scanf("%d ", &s[i]);
			sum = sum + s[i];
		}
		printf("#%d ", tc);
		if (sum%n) {
			printf("%.20f \n", (double)((double)sum / (double)n));
		}
		else {
			printf("%d \n", sum / n);
		}
	}
	return 0;
}