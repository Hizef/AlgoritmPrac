// 2023년 11월 11일 풀이

#include <stdio.h>

int main(void) {
    int test_case, T;
    int n, m;
    int flyArr[15][15];
    
    scanf("%d ", &T);
    for (test_case = 1; test_case <= T; test_case++) {
        scanf("%d %d ", &n, &m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                scanf("%d", &flyArr[i][j]);
            }
        }
        int max = 0;
        for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j <= n - m ; j++) {
    			int sum = 0;
                for (int k = i; k < i + m; k++) {
                    for (int l = j; l < j + m; l ++) {
                        sum += flyArr[k][l];
                    }
                }
                if (max < sum) max = sum;
            }
        }
        printf("#%d %d\n", test_case, max);
    }
	return 0;
}