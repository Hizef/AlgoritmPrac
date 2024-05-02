// 2023년 11월 풀이

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int test_case, T;
    scanf("%d", &T);
	for(test_case = 1; test_case <= T; ++test_case)
	{
	 int N, *p;
        scanf("%d", &N);
        p = (int*)malloc(sizeof(int) * N);
        for (int i = 0; i < N; i++) {
            scanf("%d", &p[i]);
        }
        int min = p[0], cnt = 0;
        if (p[0] < 0) {
            p[0] = -p[0];
            min = p[0];
        }
        else    min = p[0];
        for (int i = 1; i < N; i++) {
            if (p[i] < 0) {
                p[i] = -p[i];
            }
            if (p[i] < min) {
                min = p[i];
            }
        }
        for (int i = 0; i < N; i++) {
            if (p[i] == min) {
                cnt++;
            }
        }
        printf("#%d %d %d\n", test_case, min, cnt);
	}
	return 0;//정상종료시 반드시 0을 리턴해야합니다.
}